package com.louis.home.husband.webapi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

//Mybatis框架的要求扫描指定的包，包中生成操作数据库实现的类
@Configuration
@MapperScan("com.louis.home.huaband.webapi.mapper")
public class MybatisConfiguration {
}
