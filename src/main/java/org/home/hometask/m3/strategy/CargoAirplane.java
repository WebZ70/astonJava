package org.home.hometask.m3.strategy;

public class
CargoAirplane extends Airplane{
    public CargoAirplane(){
        super(new CargoAirplaneTransportStrategy());
    }
}
