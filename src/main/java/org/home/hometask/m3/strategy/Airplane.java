package org.home.hometask.m3.strategy;

public class Airplane {
    private final TransportStrategy transportStrategy;

    Airplane(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void transport(){
        transportStrategy.transport();
    }

    public void takeOff(){
        System.out.println("Взлет");
    }

    public void landing(){
        System.out.println("Посадка");
    }
}
