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

    }
}
