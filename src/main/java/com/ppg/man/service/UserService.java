package com.ppg.man.service;

import com.ppg.man.mybatis.domain.User;

import java.util.List;

public interface UserService {

    void updateName(String name);

    List<User> listUser(User user);
}
