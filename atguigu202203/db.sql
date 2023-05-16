create database mybatis_plus;
use mybatis_plus;

CREATE TABLE `user`(
    `id` bigint(20) NOT NULL COMMENT '主键ID',
    `name` varchar(30) DEFAULT NULL COMMENT '姓名',
    `age` int(3) DEFAULT NULL COMMENT '年龄',
    `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (`id`)
) ENGINE=innodb DEFAULT CHARSET=utf8mb4;

INSERT INTO user(id, name, age, email) VALUES
(1,'Jone', 18, 'test1@baomidou.com'),
(2,'Jack', 20, 'test2@baomidou.com'),
(3,'Tom', 28, 'test3@baomidou.com'),
(4,'Sandy', 21, 'test4@baomidou.com'),
(5,'Billie', 24, 'test5@baomidou.com');

select * from user;