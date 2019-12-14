package com.by.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ydd on 2019/12/14
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

}
