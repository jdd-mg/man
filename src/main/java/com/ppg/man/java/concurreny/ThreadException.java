package com.ppg.man.java.concurreny;

public class ThreadException {

    public static void main(String[] args) {

        try {
            Thread worker = new Thread(() -> {

                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                throw new RuntimeException("worker 线程 出现了异常");
            }, "worker线程！！！");

            worker.setUncaughtExceptionHandler(new MyUncoughtExceptionHandler());

            worker.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread  execute end ！！！");
    }
}

class MyUncoughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
    }
}
