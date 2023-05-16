package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.atguigu
 * @author: 张世罡
 * @CreateTime: 2023/5/16 21:52
 * @Description:
 */
@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    /**
     *
     */
    @Test
    public void testSelectList() {
        // 通过条件构造器查询一个list集合，若没有条件，则可以设置null为参数
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
