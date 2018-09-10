package org.oscm.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ReadOnlyValidator implements ConstraintValidator<ReadOnly, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if(value!=null){
            return false;
        }
        return true;
    }
}
