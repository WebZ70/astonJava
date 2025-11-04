package org.home.hometask.m1;

import java.util.HashMap;

public class CustomHashSet <E> {
    private final Object OBJECT = new Object() ;
    HashMap<E, Object> map;

    CustomHashSet() {
        map = new HashMap<>();
    }

    public boolean add(E item) {
        if (map.put(item, OBJECT) == null){
            return false;
        }
        return true;
    }

    public boolean remove(Object key){
        if (map.remove(key) == null){
            return false;
        }
        return false;
    }

}
