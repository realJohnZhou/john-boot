package com.zzq.feigntest.controller;

import com.zzq.feigntest.feign.NacosTestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    private final NacosTestClient nacosTestClient;

    public TestController(NacosTestClient nacosTestClient) {
        this.nacosTestClient = nacosTestClient;
    }

    @GetMapping
    public Object test() {
        return nacosTestClient.get();
    }
}
