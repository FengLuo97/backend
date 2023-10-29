package com.project.backend.controller;

import com.project.backend.dto.WebResult;
import com.project.backend.dto.request.user.LoginRequest;
import com.project.backend.dto.request.user.RegisterRequest;
import com.project.backend.service.UserService;
import com.project.backend.util.WebResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 21:57
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public WebResult<Void> login(@RequestBody LoginRequest request) {
        this.userService.login(request);
        return WebResultUtil.buildSuccess(null);
    }

    @RequestMapping("/register")
    public WebResult<Void> register(@RequestBody RegisterRequest request) {
        this.userService.register(request);
        return WebResultUtil.buildSuccess(null);
    }




}
