package com.ppg.man.springmvc;

import com.ppg.man.mybatis.domain.User;
import com.ppg.man.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/my")
public class MyController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list/user")
    public List<User> listUser(User user) {
        return userService.listUser(user);
    }

}
