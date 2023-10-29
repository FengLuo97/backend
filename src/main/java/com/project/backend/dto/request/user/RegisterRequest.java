package com.project.backend.dto.request.user;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

    @NotBlank
    @Length(min = 1, max = 10)
    private String username;

    @NotBlank
    @Length(min = 6, max = 15)
    private String password;

}
