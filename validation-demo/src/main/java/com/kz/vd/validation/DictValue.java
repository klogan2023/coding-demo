package com.kz.vd.validation;

import com.kz.vd.validation.validator.DictValueValidator;
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
 * @date 2023/6/4 14:44
 */
@Constraint(validatedBy = DictValueValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DictValue {

    /**
     * 业务编码
     *
     * @return
     */
    String businessCode();

    /**
     * 字段编码
     *
     * @return
     */
    String fieldCode();

    String message() default "字典异常";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
