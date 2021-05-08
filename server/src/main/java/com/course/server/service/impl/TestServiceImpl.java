package com.course.server.service.impl;

import com.course.server.entity.User;
import com.course.server.mapper.TestMapper;
import com.course.server.service.TestService;
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
