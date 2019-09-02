package com.ppg.man.java.concurreny;

import org.apache.commons.lang3.RandomUtils;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

public class CompletableFutrueTest {

    private static final ExecutorService EXECUTOR_SERVICE = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int i = RandomUtils.nextInt(0, 10);
            if (i > 2) {
                throw new RuntimeException("执行异常啦！！！");
            }
            System.out.println("async .....");
        }, EXECUTOR_SERVICE).whenComplete(new BiConsumer<Void, Throwable>() {
            @Override
            public void accept(Void aVoid, Throwable throwable) {
                System.out.println(throwable.getMessage());
            }
        });

        try {
            future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(" main thread end ...");

    }
}
