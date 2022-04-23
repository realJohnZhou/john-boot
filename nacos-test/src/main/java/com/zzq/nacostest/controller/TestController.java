package com.zzq.nacostest.controller;

import com.zzq.nacostest.properties.TestProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final TestProperties testProperties;

    public TestController(TestProperties testProperties) {
        this.testProperties = testProperties;
    }

    @GetMapping
    public Object test() {
        return testProperties;
    }
}
