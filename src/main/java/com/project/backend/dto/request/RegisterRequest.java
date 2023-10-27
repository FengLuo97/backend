package com.project.backend.dto.request;

import lombok.*;

/**
 * @Author: fengluo
 * @Date: 2023/10/27 22:08
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private Long userId;

    private String username;

    private String password;

}
