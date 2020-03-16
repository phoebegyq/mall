package com.imooc.mall.service.impl;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.RoleEnum;
import com.imooc.mall.pojo.User;
import com.imooc.mall.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Description:
 *
 * @author qyq
 * @date 2020-03-16 10:05
 */
public class UserServiceImplTest extends MallApplicationTests {


    @Autowired
    private IUserService userService;
    @Test
    public void register() {

             User user =new User("jack" ,"1234","jack@qq.com", RoleEnum.CUSTOMER.getCode());
             userService.register(user);

    }
}