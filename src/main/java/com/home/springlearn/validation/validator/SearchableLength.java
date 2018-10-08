package com.home.springlearn.validation.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author marcin.bracisiewicz
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SearchableLengthValidator.class)
@Documented
public @interface SearchableLength {

  String message() default "Invalid ticker name";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
