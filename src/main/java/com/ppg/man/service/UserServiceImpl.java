package com.ppg.man.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements AdminCacheService {

    @Override
    public void refreshCache() {
        System.out.println(" user service impl ...");
    }
}
