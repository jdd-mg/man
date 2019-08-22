package com.ppg.man.java.concurreny;

import java.util.concurrent.*;

public class ThreadTest {

    private static ExecutorService executor = null;

    static {
        ThreadFactory threadFactory = r -> new Thread(r, "from thread test ");

        executor = new ThreadPoolExecutor(2, 5,
                30, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10), new ThreadPoolExecutor.AbortPolicy());

    }


    public static void main(String[] args) {
        Future<String> future = executor.submit(() -> {
            TimeUnit.SECONDS.sleep(10);
            return "ok";
        });


        try {
            future.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("intttt........");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("超时拉");
            e.printStackTrace();
        }

//        for (int i = 0; i <20 ; i++) {
//            int j = i;
//            executor.execute(() -> {
//                System.out.println("index = " + j);
//
//                try {
//                    TimeUnit.SECONDS.sleep(3);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            });
//        }

    }

}
