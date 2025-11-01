package org.home.hometask;

import java.util.ArrayList;

public class CustomArrayList {
    private Object[] array;

    public CustomArrayList() {
        array = new Object[2];
    }

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

    public Object get(int index){
        return array[index];
    }

    public Object[] getArray(){
        return array;
    }

    private boolean checkIndex(int index){
        return index >= 0 && index < size();
    }

    public boolean remove(int index){
        if (checkIndex(index)){
            array[index] = null;
            return true;
        }else {
            return false;
        }
    }

    public boolean addAll(Object[] objects){
        for (Object object : objects) {
            if (!add(object)) {
                return false;
            }
        }
        return true;
    }

}
