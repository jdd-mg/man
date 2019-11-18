package com.ppg.man.hessian;

import org.springframework.stereotype.Component;

@Component
public class Provider implements ProviderService {

    @Override
    public void test() {
        System.out.println("hello world");
    }
}
