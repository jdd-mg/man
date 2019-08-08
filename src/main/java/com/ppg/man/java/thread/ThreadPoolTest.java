package com.ppg.man.java.thread;

import java.util.concurrent.*;

public class ThreadPoolTest {

    private static ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        int count = 10;
        CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {

            final int temp = i;

            executor.execute(() -> {

                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("执行完毕 I=" + temp);

                countDownLatch.countDown();
            });


            System.out.println("i = " + i);
        }


        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
