package org.wuyd.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wuyd.feignconsumer.service.HelloService;

@EnableFeignClients
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class FeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

    @Autowired
    private HelloService helloService;

    @GetMapping("feign")
    public String feign(){
        System.out.println("远程调用Feign");
        System.out.println(helloService.hello());
        return "feign-success";
    }


}
