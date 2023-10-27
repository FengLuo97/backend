package com.project.backend.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:06
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;

    private String username;

    private String password;

    private String nickname;

    private String email;

    private String phoneNumber;

    private Integer sex;

    private String avatarUrl;

    private Integer type;

    private Integer status;

    private LocalDateTime tmCreate;

    private LocalDateTime tmUpdate;

}
