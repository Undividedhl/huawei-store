package com.suckmydisk.huawei.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

/**
 * @author 10199
 * @date 2020/8/14
 */
@Configuration
@MapperScan("com.suckmydisk.huawei.dao")
public class MybatisConfig {
}
