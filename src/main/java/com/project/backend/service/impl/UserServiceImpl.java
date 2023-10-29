package com.project.backend.service.impl;

import com.project.backend.dto.request.user.LoginRequest;
import com.project.backend.dto.request.user.RegisterRequest;
import com.project.backend.entity.User;
import com.project.backend.mapper.UserMapper;
import com.project.backend.service.UserService;
import com.project.backend.util.Assert;
import com.project.backend.util.Md5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:05
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void login(LoginRequest loginRequest) {
        Assert.isNull(loginRequest, "登录请求对象不能为空！");
        User user = userMapper.selectUserByUsername(loginRequest.getUsername());
        if (user != null) {
            if (user.getPassword().equals(Md5Util.passwordMd5(loginRequest.getPassword()))) {
                log.info("登录成功");
                return;
            }
            log.info("密码错误");
        }
    }

    @Override
    public void register(RegisterRequest registerRequest) {
        Assert.isNull(registerRequest, "注册请求对象不能为空！");
        if (userMapper.selectUserByUsername(registerRequest.getUsername()) != null) {
            return;
        }
        userMapper.insertUser(User.builder()
                .username(registerRequest.getUsername())
                .password(Md5Util.passwordMd5(registerRequest.getPassword()))
                .nickname(null)
                .email(null)
                .phoneNumber(null)
                .sex(1)
                .avatarUrl("")
                .type(0)
                .status(0)
                .build());
    }

}
