package com.zhongjinlang.controller;

import com.zhongjinlang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhongjinlang
 * @date: Created in 2019/5/3 0:37
 * @description: 消费服务
 */
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
