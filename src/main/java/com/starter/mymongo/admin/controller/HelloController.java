package com.starter.mymongo.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tianlin
 * @date 2021/4/6 20:51
 */
@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public Object hello() {
        return "Hello Mongo!";
    }

}
