package com.project.backend.util;

import org.springframework.util.DigestUtils;

/**
 * @Author: fengluo
 * @Date: 2023/10/29 15:53
 */
public class Md5Util {

    public static String passwordMd5(String password) {
        return DigestUtils.md5DigestAsHex(DigestUtils.md5DigestAsHex(password.getBytes()).getBytes());
    }

}
