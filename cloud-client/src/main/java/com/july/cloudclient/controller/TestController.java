package com.july.cloudclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * @author zqk
 * @since 2019/11/15
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/test")
    @HystrixCommand(fallbackMethod = "testError")
    public String test(@RequestParam String msg){
        return "这是测试信息 ===> " + msg + "，测试项目端口号 ===> " + serverPort;
    }

    public String testError(String msg){
        return "Hello,The system is error!";
    }

}
