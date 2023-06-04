package com.kz.vd;

import com.kz.vd.enums.PositionEnum;
import com.kz.vd.validation.DictValue;
import com.kz.vd.validation.EnumValue;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 员工
 *
 * @author kz
 * @description
 * @date 2023/6/4 13:41
 */
@Data
public class Staff {

    /**
     * 姓名
     */
    @NotEmpty
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职位
     */
//    @EnumValue(enumClass = PositionEnum.class)
    @DictValue(businessCode = "person", fieldCode = "position")
    private String position;

}
