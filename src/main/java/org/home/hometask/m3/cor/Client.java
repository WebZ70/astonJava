package org.home.hometask.m3.cor;

public class Client {
    public static void main(String[] args) {
        Handler handler = new NegativeNumberHandler();
        Handler handler2 = new PositivNumberHandler();
        Handler handler3 = new ZeroNumberHandler();

        handler.setNext(handler2);
        handler2.setNext(handler3);

        handler.handlerRequest(-8);
    }
}
