package com.itheima.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: mybatisplus
 * @BelongsPackage: com.itheima.config
 * @author: 张世罡
 * @CreateTime: 2023/5/8 21:09
 * @Description:
 */
@Configuration
public class MpConfig {

    @Bean
    public MybatisPlusInterceptor mpInterceptor() {
        // 1. 定义MP拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 2. 添加具体的拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
