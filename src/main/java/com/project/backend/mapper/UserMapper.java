package com.project.backend.mapper;

import com.project.backend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:10
 */
@Mapper
public interface UserMapper {

    int insertUser(User user);

    User selectUserByUserId(@Param("userId") Long userId);

    User selectUserByUsername(@Param("username") String username);

}
