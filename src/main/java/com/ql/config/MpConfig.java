package com.ql.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: springboot-mybatis
 * @description:
 * @author: quliang
 * @create: 2022-04-01 14:33
 **/
@Configuration
//@EnableTransactionManagement
//@MapperScan("com.ql.mapper")
public class MpConfig {

//    @Bean
//    public PaginationInnerInterceptor paginationInnerInterceptor(){
//        PaginationInnerInterceptor interceptor = new PaginationInnerInterceptor();
//        interceptor.setOverflow(true);
//        interceptor.setDbType(DbType.MYSQL);
//        return interceptor;
//    }

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
