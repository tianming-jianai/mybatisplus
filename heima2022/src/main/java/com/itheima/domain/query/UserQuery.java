package com.itheima.domain.query;

import com.itheima.domain.User;
import lombok.Data;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.itheima.domain.query
 * @author: 张世罡
 * @CreateTime: 2023/5/8 21:38
 * @Description:
 */
@Data
public class UserQuery extends User {
    // 年龄上限
    private Integer age2;
}
