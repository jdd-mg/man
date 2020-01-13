package com.ppg.man.controller;

import com.ppg.man.service.AdminCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyController {

    @Autowired
    private List<AdminCacheService> adminCacheServices;

    @RequestMapping("/refresh")
    public void refreshCache() {
        adminCacheServices.forEach(AdminCacheService::refreshCache);
    }
}
