package com.project.backend.service;

import com.project.backend.dto.request.LoginRequest;
import com.project.backend.dto.request.RegisterRequest;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 21:59
 */
public interface UserService {

    void login(LoginRequest loginRequest);

    void register(RegisterRequest registerRequest);

}
