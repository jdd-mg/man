package com.ppg.man.java.collection;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.BiMap;
import org.apache.tomcat.util.json.JSONParser;

import java.util.*;

public class MapTest {

    private static Map<String, Object> map;

    static {

        map = new LinkedHashMap<>();

//        map = new HashMap<>();

    }

    public static void main(String[] args) {
        map.put("111qqq", "1");
        map.put("wwww", "2");
        map.put("???", "3");
        map.put(";;;", "4");
        map.put("]]]", "5");
        map.put("wwww", "6");


        map.forEach((key, value) -> {
            System.out.println(value);
        });

        System.out.println(JSON.toJSONString(map));
    }
}
