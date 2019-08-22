package com.ppg.man.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void updateName(String name) {
        log.info("修改用户名称， name ={}", name);
    }
}
