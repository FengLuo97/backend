package com.project.backend.mapper;

import com.project.backend.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:10
 */
@Mapper
public interface UserMapper {

    User selectUserByUserId(@Param("userId") Long userId);

}
