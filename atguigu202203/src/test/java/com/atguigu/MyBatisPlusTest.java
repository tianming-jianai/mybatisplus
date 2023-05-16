package com.atguigu;

import com.atguigu.mapper.UserMapper;
import com.atguigu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
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

    /**
     *
     */
    @Test
    public void testInsert() {
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setEmail("zhangsan@atguigu.com");
        int result = userMapper.insert(user);
        System.out.println("result: " + result);
        System.out.println("userId: " + user.getId());
    }

    /**
     *
     */
    @Test
    public void testDelete() {
        // int result = userMapper.deleteById(1);
        // System.out.println("result: " + result);

        // HashMap<String, Object> map = new HashMap<>();
        // map.put("name", "zhangsan");
        // map.put("age", 23);
        // int result = userMapper.deleteByMap(map);
        // System.out.println("result: " + result);

        int result = userMapper.deleteBatchIds(Arrays.asList(1L, 2L, 3L));
        System.out.println("result: " + result);
    }
}
