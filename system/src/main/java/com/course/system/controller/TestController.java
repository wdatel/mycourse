package com.course.system.controller;

import com.course.system.entity.User;
import com.course.system.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version V4.0
 * @program: course
 * @description:
 * @author: wdl
 * @create: 2021-05-07 14:50
 **/

@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService;

    @RequestMapping("/test")
    public String test(){
        return "success";
    }

    @RequestMapping("/user")
    public List<User> user(){
        return testService.list();
    }
}
