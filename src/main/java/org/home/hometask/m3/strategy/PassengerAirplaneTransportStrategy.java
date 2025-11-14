package org.home.hometask.m3.strategy;

public class PassengerAirplaneTransportStrategy implements TransportStrategy {

    @Override
    public void transport() {
        System.out.println("Перевожу пассажиров");
    }
}
