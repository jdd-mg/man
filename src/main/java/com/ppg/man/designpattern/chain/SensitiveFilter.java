package com.ppg.man.designpattern.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "sensitiveFilter")
public class SensitiveFilter implements Filter {

    @Qualifier(value = "faceFilter")
    @Autowired
    private Filter filter;

    @Override
    public void doFilter(Message message) {
        filter.doFilter(message);
    }
}
