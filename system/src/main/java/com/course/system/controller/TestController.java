package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V4.0
 * @program: course
 * @description:
 * @author: wdl
 * @create: 2021-05-07 14:50
 **/

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
