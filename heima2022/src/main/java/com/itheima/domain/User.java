package com.itheima.domain;

import lombok.Data;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.itheima.domain
 * @author: 张世罡
 * @CreateTime: 2023/5/8 20:07
 * @Description:
 */
@Data
public class User {
    private Long id;
    private String name;
    private String password;
    private int age;
    private String tel;
}
