package com.project.backend.dto;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: fengluo
 * @Date: 2023/10/29 14:23
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class WebResult<T> {

    private String rspCode;

    private String rspDesc;

    private T data;

}
