package org.wuyd.feignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wuyd
 * 2019/8/6 16:31
 */
@FeignClient("service-hi")
@Service
public interface HelloService {
    @RequestMapping("hello")
    String hello();
}
