package org.home.hometask.m3.proxy;

import java.util.ArrayList;
import java.util.List;

public class OrderListStudents implements OrderList {
    List<String> list;
    public OrderListStudents() {
        list = new ArrayList<>();
    }
    @Override
    public List<String> getOrderList(){
        list.add("5634");
        list.add("3456");
        list.add("2351");
        return list;
    }
}
