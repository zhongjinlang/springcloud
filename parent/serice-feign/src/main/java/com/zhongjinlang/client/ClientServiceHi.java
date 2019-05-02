package com.zhongjinlang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: zhongjinlang
 * @date: Created in 2019/5/3 1:06
 * @description: 远程服务接口
 */
@FeignClient(value = "service-hi")  // 远程服务名称
public interface ClientServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name); // 如果PathVariable注解也需要加上别名
}
