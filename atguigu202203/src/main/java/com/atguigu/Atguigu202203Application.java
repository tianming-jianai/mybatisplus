package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.mapper") // 扫描mapper接口
public class Atguigu202203Application {

    public static void main(String[] args) {
        SpringApplication.run(Atguigu202203Application.class, args);
    }

}
