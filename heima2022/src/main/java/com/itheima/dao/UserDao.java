package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.itheima.dao
 * @author: 张世罡
 * @CreateTime: 2023/5/8 20:16
 * @Description:
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
