package com.ppg.man;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Data
@Slf4j
@AllArgsConstructor
public class LombokTest {

    private String name;

    private int id;

    private static ExecutorService executorService = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {

        LombokTest lombokTest = new LombokTest("LombokTest", 1);

        final int id1 = lombokTest.getId();

        final String name1 = lombokTest.getName();

        executorService.execute(new Runnable() {

//            private int id;
//
//            private String name;
//
//            {
//                this.id = id1;
//                this.name = name1;
//            }

            @Override
            public void run() {
                System.out.println(id1 + name1);
            }
        });
    }
}
