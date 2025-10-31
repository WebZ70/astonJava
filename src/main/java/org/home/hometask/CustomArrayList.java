package org.home.hometask;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {
    private Object[] array = new Object[2];

    public int size(){
        return array.length;
    }

    public boolean isEmpty(Object object){
        if (object == null){
            return true;
        }else return false;
    }

    public Object[] extensionArray(Object[] object){
        Object[] extensionArray = new Object[object.length * 2];
        for (int i = 0; i < object.length; i++){
            extensionArray[i] = object[i];
        }
        System.out.println("extensionArray");
        array =  extensionArray;
        return array;
    }

    public int getLastEmpty(Object[] object){
        for (int i = 0; i < object.length; i++){
            if (isEmpty(object[i])){
                return i;
            }
        }
        return getLastEmpty(extensionArray(object));
    }

    public boolean add(Object object){
        int lastEmpty = getLastEmpty(array);
        if (lastEmpty > -1){
            array[lastEmpty] = object;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);
        System.out.println(Arrays.toString(list.array));
    }

    public void get(){

    }

    public void remove(){

    }

    public void addAll(){

    }

}
