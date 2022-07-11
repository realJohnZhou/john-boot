package com.john.boot.demo.controller;

import com.john.boot.common.dto.AuthUser;
import com.john.boot.common.util.AuditUserContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * this is demo
 *
 * @author john
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public AuthUser getMe() {
        return AuditUserContextHolder.getUser();
    }
}
