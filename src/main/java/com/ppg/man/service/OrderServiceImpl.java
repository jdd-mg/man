package com.ppg.man.service;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements  AdminCacheService{


    @Override
    public void refreshCache() {
        System.out.println(" order service impl ...");
    }
}
