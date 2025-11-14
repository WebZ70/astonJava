package org.home.hometask.m3.strategy;

public class PassengerAirplane extends Airplane {
    public PassengerAirplane() {
        super(new PassengerAirplaneTransportStrategy());
    }
}
