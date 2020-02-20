package pacakge.project.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * This interface is used to validate String.
 * 
 * @author kapil.sharma
 * @Since 1-May-2019
 * 
 */
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { StringValidatorImpl.class })
public @interface StringValidator {

  /**
   * To print the message.
   * 
   * @return message
   */
  String message() default "String Validation Failed. Only the Following character"
      + " are allowed A-Z a-z 0-9 - . ' ( ) / , ! : ~ # @ \n";

  /**
   * To define the group.
   * 
   * @return groups
   */
  Class<?>[] groups() default {};

  /**
   * To keep data.
   * 
   * @return payload
   */
  Class<? extends Payload>[] payload() default {};

}
