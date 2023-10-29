package com.project.backend.dto;

import lombok.*;

/**
 * @Author: fengluo
 * @Date: 2023/10/29 14:29
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PageDto<T> {

    private Integer pageNo;

    private Integer pageSize;

    private Integer currentPage;

    private Integer totalRecords;

    private T data;

    PageDto(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

}
