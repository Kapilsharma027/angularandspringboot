package packge.project.util;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	  @Override 
	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
	      HttpHeaders headers, HttpStatus status, WebRequest request) {

	    List<String> errors = new ArrayList<String>();
	    for (FieldError error : ex.getBindingResult().getFieldErrors()) {
	      logger.error(error.getField() + ": " + error.getDefaultMessage());
	      errors.add(error.getField() + ": " + error.getDefaultMessage());
	    }
	    for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
	      logger.error(error.getObjectName() + ": " + error.getDefaultMessage());
	      errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
	    }
	    return new ResponseEntity<Object>(createErrorResponse(HttpStatus.BAD_REQUEST.value(),
	        "String validation failed", errors), HttpStatus.BAD_REQUEST);
	  }
	  

	 @ExceptionHandler(value = { ProjectDataException.class })
	  protected ResponseEntity<Response> handleCommonException(final ProjectDataException ex,
	      final WebRequest request) {
	    if (ex.getObject() == null) {
	      return new ResponseEntity<Response>(
	          createErrorResponse(ex.getHttpStatus().value(), ex.getMessage(), null),
	          ex.getHttpStatus());
	    } else {
	      return new ResponseEntity<Response>(
	          createErrorResponse(ex.getHttpStatus().value(), ex.getMessage(), ex.getObject()),
	          ex.getHttpStatus());
	    }

	  }
	 
	 
	  @ExceptionHandler(value = { Exception.class })
	  protected ResponseEntity<Response> handleGlobalException(final Exception ex,
	      final WebRequest request) {
	    ex.printStackTrace();
	    return new ResponseEntity<Response>(
	        createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), null),
	        HttpStatus.INTERNAL_SERVER_ERROR);
	  }
	  

	 
	 private Response createErrorResponse(int statusCode, String message, Object data) {
		    return new Response(statusCode, message, data);

		  }
}

