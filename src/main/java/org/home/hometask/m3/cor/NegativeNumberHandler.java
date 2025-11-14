package org.home.hometask.m3.cor;

public class NegativeNumberHandler extends Handler {
    @Override
    public void handlerRequest(int request){
        if (request < 0){
            System.out.println("Меньше 0");
        }
        if (next != null){
            next.handlerRequest(request);
        }
    }
}
