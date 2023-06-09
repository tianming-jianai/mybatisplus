package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.itheima
 * @author: 张世罡
 * @CreateTime: 2023/5/8 21:25
 * @Description:
 */
@SpringBootTest
public class testDql {

    @Autowired
    UserDao userDao;

    /**
     *
     */
    @Test
    public void test() {
        // 方式一：按条件查询
        // QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // queryWrapper.lt("age", 18);

        // 方式二：lambda格式按条件查询
        // QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // queryWrapper.lambda().lt(User::getAge, 18);

        // 方式三：lambda格式按条件查询
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.lt(User::getAge, 10);
        List<User> users = userDao.selectList(queryWrapper);
        System.out.println(users);
    }

    /**
     *
     */
    @Test
    public void testNullQuery() {
        UserQuery uq = new UserQuery();
        // uq.setAge(10);
        uq.setAge2(30);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2());
        lqw.gt(null != uq.getAge(), User::getAge, uq.getAge());
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }
}
