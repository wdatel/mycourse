package com.course.system.service.impl;

import com.course.system.entity.User;
import com.course.system.mapper.TestMapper;
import com.course.system.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version V4.0
 * @program: course
 * @description:
 * @author: wdl
 * @create: 2021-05-07 23:25
 **/

@AllArgsConstructor
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Override
    public List<User> list() {
        return testMapper.userList();
    }
}
