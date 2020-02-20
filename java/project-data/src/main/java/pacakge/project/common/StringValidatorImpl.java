package pacakge.project.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;

import packge.project.util.ProjectDataException;


/**
 * This interface is used to validate String.
 * 
 * @author kapil.sharma
 * @Since 19-feb-2020
 * 
 */
public class StringValidatorImpl implements ConstraintValidator<StringValidator, String> {

  @Override
  public void initialize(StringValidator constraintAnnotation) {
    constraintAnnotation.message();
  }

  @Override
  public boolean isValid(String string, ConstraintValidatorContext arg1) {
    if (string == null || string.isEmpty()) {
      return true;
    }
    Matcher matcher = Pattern.compile("^[A-Za-z0-9-.'()\\/,!:~#@\\n ]+$",
    	      Pattern.CASE_INSENSITIVE).matcher(string);
//    if(!matcher.find())
//    	throw new MethodArgumentNotValidException;

    return matcher.find();
    
   
  }

}
