package com.project.backend.util;

import com.project.backend.dto.WebResult;

/**
 * @Author: fengluo
 * @Date: 2023/10/29 14:50
 */
public class WebResultUtil {

    public static <T> WebResult<T> buildSuccess(T data) {
        WebResult<T> webResult = new WebResult<>();
        webResult.setRspCode("200");
        webResult.setRspDesc("操作成功");
        webResult.setData(data);
        return webResult;
    }

    public static <T> WebResult<T> buildFailure() {
        WebResult<T> webResult = new WebResult<>();
        webResult.setRspCode("400");
        webResult.setRspDesc("操作失败");
        return webResult;
    }

}
