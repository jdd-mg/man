package com.ppg.man;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManApplication.class, args);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("钩子 执行 成功 啦！！！！");
        }));
    }

}
