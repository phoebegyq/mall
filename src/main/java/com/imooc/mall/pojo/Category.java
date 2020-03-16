package com.imooc.mall.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Description:
 *
 * @author qyq
 * @date 2020-02-26 15:40
 */
@Data
public class Category {

    private Integer id;

    private String parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;


}
