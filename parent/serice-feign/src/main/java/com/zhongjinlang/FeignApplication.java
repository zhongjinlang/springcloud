package com.zhongjinlang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: zhongjinlang
 * @date: Created in 2019/5/3 1:02
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient    // 发布服务
@EnableDiscoveryClient // 消费服务【发现其他服务】
@EnableFeignClients // 开启feign功能
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
