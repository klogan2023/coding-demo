package com.kz.vd.validation.validator;

import com.kz.vd.validation.DictValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kz
 * @description
 * @date 2023/6/4 14:45
 */
public class DictValueValidator implements ConstraintValidator<DictValue, Object> {

    private String businessCode;

    private String fieldCode;

    @Override
    public void initialize(DictValue dictValue) {
        businessCode = dictValue.businessCode();
        fieldCode = dictValue.fieldCode();

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        String code = String.valueOf(value);
        // 是否存在字典中
        return existsInDict(businessCode, fieldCode, code);
    }

    /**
     * 是否存在字典中
     *
     * @param businessCode
     * @param fieldCode
     * @param code
     */
    private boolean existsInDict(String businessCode, String fieldCode, String code) {

        // 模拟查询数据库
        // 实际业务中，可加入缓存，提高效率
        Map<String, Object> hashMap = new HashMap<>();
        hashMap.put("1", "普通员工");
        hashMap.put("2", "小组长");
        hashMap.put("3", "管理员");
        hashMap.put("4", "老板");

        return hashMap.containsKey(code);
    }
}
