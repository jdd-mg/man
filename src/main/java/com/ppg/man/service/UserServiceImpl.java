package com.ppg.man.service;

import com.ppg.man.mybatis.domain.User;
import com.ppg.man.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void updateName(String name) {
        log.info("修改用户名称， name ={}", name);
    }

    @Override
    public List<User> listUser(User user) {
        return userMapper.queryUser(user);
    }
}
