package com.home.springlearn.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author marcin.bracisiewicz
 */
public class SearchableLengthValidator implements ConstraintValidator<SearchableLength, String> {

  @Override
  public boolean isValid(final String s, final ConstraintValidatorContext constraintValidatorContext) {
    return s.length() > 2 && s.length() < 5;
  }
}
