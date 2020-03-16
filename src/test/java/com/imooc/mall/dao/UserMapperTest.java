package com.imooc.mall.dao;

import com.imooc.mall.MallApplicationTests;
import com.imooc.mall.enums.RoleEnum;
import com.imooc.mall.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Description:
 *
 * @author qyq
 * @date 2020-03-13 19:53
 */
public class UserMapperTest extends MallApplicationTests {

    @Autowired
    private  UserMapper userMapper;

    @Test
    public void queryById() {
        User user = userMapper.queryById(1);
        System.out.println(user.toString());

    }

    @Test
    public void countByUsername(){
        int count = userMapper.countByUsername("admin");
        System.out.println(count);
    }


    @Test
    public void insertTest() {

        User user = new User("jack","123456","jack@qq.com", RoleEnum.CUSTOMER.getCode());
        int test = userMapper.insert(user);
        System.out.println("************test***********");


    }
}