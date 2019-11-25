package com.july.cloudturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 测试断路器聚合监控信息
 * @author zqk
 * @since 2019/11/25
 */
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableTurbine
public class CloudTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudTurbineApplication.class, args);
    }

}
