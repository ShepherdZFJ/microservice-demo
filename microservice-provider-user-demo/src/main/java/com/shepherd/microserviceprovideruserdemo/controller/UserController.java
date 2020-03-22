package com.shepherd.microserviceprovideruserdemo.controller;

import com.shepherd.microserviceprovideruserdemo.dao.UserMapper;
import com.shepherd.microserviceprovideruserdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id) {
        User user = this.userMapper.selectByPrimaryKey(1);
        return user;
    }
}