package com.atguigu.pojo;

import lombok.Data;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.atguigu.pojo
 * @author: 张世罡
 * @CreateTime: 2023/5/16 21:46
 * @Description:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
