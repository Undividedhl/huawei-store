package com.suckmydisk.huawei.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * @author 10199
 * @date 2020/8/14
 */
@Configurable
@MapperScan("com.suckmydisk.huawei.dao")
public class MybatisConfig {
}
