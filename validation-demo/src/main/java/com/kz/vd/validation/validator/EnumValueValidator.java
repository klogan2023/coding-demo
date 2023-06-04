package com.kz.vd.validation.validator;

import com.kz.vd.enums.ValidatorEnum;
import com.kz.vd.validation.EnumValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * @author kz
 * @description
 * @date 2023/6/4 13:53
 */
public class EnumValueValidator implements ConstraintValidator<EnumValue, Object> {

    private ValidatorEnum[] validatorEnums;

    @Override
    public void initialize(EnumValue enumValue) {
        Class<? extends ValidatorEnum> enumClass = enumValue.enumClass();
        if (enumClass.isEnum()) {
            validatorEnums = enumClass.getEnumConstants();
        }
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        for (ValidatorEnum validatorEnum : validatorEnums) {
            if (Objects.equals(validatorEnum.getCode(), value)) {
                return true;
            }
        }
        return false;
    }

}
