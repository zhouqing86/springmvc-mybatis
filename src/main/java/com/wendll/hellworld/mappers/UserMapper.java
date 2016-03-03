package com.wendll.hellworld.mappers;


import com.wendll.hellworld.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    @Select("select * from users where name=#{name}")
    public User getUserByName(@Param("name") String name);

}