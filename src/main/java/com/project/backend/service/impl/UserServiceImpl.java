package com.project.backend.service.impl;

import com.project.backend.dto.request.LoginRequest;
import com.project.backend.dto.request.RegisterRequest;
import com.project.backend.mapper.UserMapper;
import com.project.backend.service.UserService;

import javax.annotation.Resource;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:05
 */
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void login(LoginRequest loginRequest) {

    }

    @Override
    public void register(RegisterRequest registerRequest) {

    }
}
