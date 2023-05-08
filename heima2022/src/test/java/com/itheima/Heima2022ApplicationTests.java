package com.itheima;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Heima2022ApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    /**
     *
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setId(5L);
        user.setName("黑马程序员");
        user.setPassword("itheima");
        user.setTel("4006184000");
        userDao.insert(user);
    }

    /**
     *
     */
    @Test
    public void testGetByPage() {
        IPage<User> page = new Page<>(2, 3);
        page = userDao.selectPage(page, null);
        System.out.println("当前页码值：" + page.getCurrent());
        System.out.println("每页显示条数：" + page.getSize());
        System.out.println("一共多少页：" + page.getPages());
        System.out.println("一共多少条数据：" + page.getTotal());
        System.out.println("数据：" + page.getRecords());
    }

}
