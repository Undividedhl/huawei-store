package com.suckmydisk.huawei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 10199
 */
@SpringBootApplication
@MapperScan("com.suckmydisk.huawei.dao")
public class HuaweiAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaweiAdminApplication.class, args);
    }

}
