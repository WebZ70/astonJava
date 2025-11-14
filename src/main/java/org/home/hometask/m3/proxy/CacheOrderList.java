package org.home.hometask.m3.proxy;

import java.util.ArrayList;
import java.util.List;

public class CacheOrderList implements OrderList{
    OrderListStudents orderListStudents;
    List<String> cacheOrdersList = new ArrayList<>();

    public CacheOrderList(){
        this.orderListStudents = new OrderListStudents();
    }

    @Override
    public List<String> getOrderList() {
        if (cacheOrdersList.isEmpty()) {
            cacheOrdersList =  orderListStudents.getOrderList();
        }
        return cacheOrdersList;
    }
}
