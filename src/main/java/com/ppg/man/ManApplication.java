package com.ppg.man;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManApplication {

    public static void main(String[] args) {


        SpringApplication.run(ManApplication.class, args);


//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            System.out.println("钩子 执行 成功 啦！！！！");
//        }));
//
//
//        Thread thread = new Thread(() -> {
//
//            int i = 0;
//
//            while (true) {
//                if (i > 1000000) {
////                    throw new  RuntimeException("执行到 最后拉！！！！不能再执行拉！！！");
//                    i = 0;
//                }
//                int j = 0;
//                System.out.println("man test thread cpu result................................................." + (i + j));
//                i++;
//            }
//        });


//        thread.setName("man test thread cpu ....");
//        thread.start();
    }

}
