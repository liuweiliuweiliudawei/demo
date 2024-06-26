package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author slc
 * @version 1.0
 * @date 2024-06-17 11:14
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/test")
    private String Demo(){

        return "Hello world";

    }

}
