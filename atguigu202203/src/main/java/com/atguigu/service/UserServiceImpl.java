package com.atguigu.service;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.atguigu.service
 * @author: 张世罡
 * @CreateTime: 2023/5/17 20:45
 * @Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}
