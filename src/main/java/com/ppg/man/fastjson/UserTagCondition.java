package com.ppg.man.fastjson;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Sets;

import java.util.Set;

public class UserTagCondition implements ICondition {

    private Set<String> set = Sets.newHashSet();

    private Class<UserTagCondition> clazz;

    @Override
    public void test() {


    }
}
