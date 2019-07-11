package com.ppg.man;

import java.time.LocalDateTime;
import java.util.concurrent.LinkedBlockingDeque;

public class MainTest {

    public static LinkedBlockingDeque<String> queue = new LinkedBlockingDeque<>(10);

    public static void main(String[] args) throws Exception {


        String s = LocalDateTime.now().toLocalDate() + "";
        System.out.println(LocalDateTime.now().toLocalDate().toString());


    }


}
