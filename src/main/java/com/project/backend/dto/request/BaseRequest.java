package com.project.backend.dto.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

/**
 * @Author: fengluo
 * @Date: 2023/10/29 14:38
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BaseRequest {


    private Integer pageNo = 1;

    private Integer pageSize = 20;

    private Long loginUserId;

    private String loginUsername;

}
