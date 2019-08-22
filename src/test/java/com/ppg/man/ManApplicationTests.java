package com.ppg.man;

import com.ppg.man.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        userService.updateName("lzp");
    }

}
