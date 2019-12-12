package com.ppg.man.algorithm.linkedlist;

import com.google.common.collect.Maps;

import java.util.Map;

public class LinkedListMain {

    public static void main(String[] args) {

        Map<String, Data> map = Maps.newHashMapWithExpectedSize(5);

        Data data1 = new Data();
        data1.setValue("1");

        map.put(data1.getValue(), data1);

        Data data2 = new Data();
        data2.setValue("2");
        map.put(data2.getValue(), data2);
        data1.setNext(data2);
        data2.setPrev(data1);

        Data data3 = new Data();
        data3.setValue("3");
        map.put(data3.getValue(), data3);
        data3.setPrev(data2);
        data2.setNext(data3);

        Data data4 = new Data();
        data4.setValue("4");
        map.put(data4.getValue(), data4);
        data4.setPrev(data3);
        data3.setNext(data4);

        Data data5 = new Data();
        data5.setValue("5");
        map.put(data5.getValue(), data5);
        data5.setPrev(data4);
        data4.setNext(data5);


        Data data = map.get("3");

        System.out.println(data);

        Data data6 = new Data();
        data6.setValue("6");


        data.getPrev().setNext(data6);
        data6.setPrev(data.getPrev());

        data6.setNext(data.getNext());
        data.getNext().setPrev(data6);

        System.out.println(data6);
    }
}
