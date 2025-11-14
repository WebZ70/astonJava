package org.home.hometask.m3.cor;

public class PositivNumberHandler extends Handler{
    @Override
    public void handlerRequest(int request) {
        if(request > 0){
            System.out.println("Больше 0");
        }
        if (next != null) {
            next.handlerRequest(request);
        }
    }
}
