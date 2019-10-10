package com.ppg.man;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.ppg.man.mybatis.mapper")
@SpringBootApplication
public class ManApplication {

    public static void main(String[] args) {
        System.setProperty("jdd.ttt.qqq", "/yyyyy");
        SpringApplication.run(ManApplication.class, args);
    }

}
