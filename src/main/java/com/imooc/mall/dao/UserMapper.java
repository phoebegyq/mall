package com.imooc.mall.dao;

import com.imooc.mall.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

//    @Select("select * from mall_user where id = #{id}")
    User queryById(@Param("id") Integer id);

    int countByUsername(String username);

    int countByEmail(String email);




}