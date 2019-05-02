package com.zhongjinlang.controller;

import com.zhongjinlang.client.ClientServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhongjinlang
 * @date: Created in 2019/5/3 1:11
 * @description:
 */
@RestController
public class HiController {

    @Autowired
    private ClientServiceHi clientServiceHi;

    @GetMapping("test.do")
    public String sayHi() {
        return clientServiceHi.sayHiFromClientOne("zhangsan");
    }
}
