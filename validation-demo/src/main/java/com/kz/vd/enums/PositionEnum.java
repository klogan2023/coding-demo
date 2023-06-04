package com.kz.vd.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author kz
 * @description
 * @date 2023/6/4 14:38
 */
@AllArgsConstructor
@Getter
public enum PositionEnum implements ValidatorEnum {

    /**
     *
     */
    staff("1", "普通员工"),
    group_leader("2", "小组长"),
    manager("3", "管理员"),
    boss("4", "老板"),
    ;

    private final String code;
    private final String desc;

    @Override
    public Object getCode() {
        return this.code;
    }
}
