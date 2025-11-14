package org.home.hometask.m3.proxy;

import java.util.stream.Stream;

public class MainProxy {
    public static void main(String[] args) {
        OrderList orderListStudents = new OrderListStudents();
        orderListStudents.getOrderList().forEach(System.out::println);

        CacheOrderList cacheOrderList = new CacheOrderList();
        cacheOrderList.getOrderList().forEach(System.out::println);

    }
}
