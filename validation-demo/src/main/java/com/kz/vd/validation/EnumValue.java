package com.kz.vd.validation;

import com.kz.vd.enums.ValidatorEnum;
import com.kz.vd.validation.validator.EnumValueValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kz
 * @description
 * @date 2023/6/4 13:46
 */
@Constraint(validatedBy = EnumValueValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnumValue {

    Class<? extends ValidatorEnum> enumClass();

    String message() default "枚举值范围异常";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
