package com.imooc.mall.enums;

import lombok.Getter;

/**
 * Description:
 * 角色0-管理员,1-普通用户
 *
 * @author qyq
 * @date 2020-03-13 15:26
 */
@Getter
public enum RoleEnum {

    ADMIN(0),
    CUSTOMER(1),
            ;
    Integer code;
    RoleEnum(Integer code){
        this.code = code;
    }

}
