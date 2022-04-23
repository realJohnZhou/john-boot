package com.zzq.feigntest.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "nacos-test")
public interface NacosTestClient {
    @GetMapping("/test")
    Object get();
}
