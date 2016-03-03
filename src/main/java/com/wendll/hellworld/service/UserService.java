package com.wendll.hellworld.service;


import com.wendll.hellworld.mappers.UserMapper;
import com.wendll.hellworld.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }
}
