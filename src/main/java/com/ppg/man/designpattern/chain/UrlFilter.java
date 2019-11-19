package com.ppg.man.designpattern.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UrlFilter implements Filter {

    @Qualifier(value = "sensitiveFilter")
    @Autowired
    private Filter filter;


    @Override
    public void doFilter(Message message) {
        //TODO
        filter.doFilter(message);
        //TODO
    }
}
