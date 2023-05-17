package com.atguigu.mapper;

import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.atguigu.mapper
 * @author: 张世罡
 * @CreateTime: 2023/5/16 21:49
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, String> selectMapById(Long id);
}
