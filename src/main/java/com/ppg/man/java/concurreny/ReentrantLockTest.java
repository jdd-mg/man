package com.ppg.man.java.concurreny;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private ReentrantLock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    public void methodA() {

        lock.lock();

        try {
            System.out.println(" A.... START !");
            condition.await();
            System.out.println(" A... END !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void methodB() {
        lock.lock();
        try {
            System.out.println(" B ... start !");
            condition.signal();
            System.out.println(" B ... END !");
            Thread.sleep(2000L);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockTest test = new ReentrantLockTest();
        Thread A = new Thread(() -> {
            test.methodA();
        });
        A.start();

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread B = new Thread(() -> {
            test.methodB();
        });
        B.start();

        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end !");


    }

}
