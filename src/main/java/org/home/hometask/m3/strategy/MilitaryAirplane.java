package org.home.hometask.m3.strategy;

public class
MilitaryAirplane extends Airplane {
    public MilitaryAirplane(){
        super(new MilitaryAirplaneTransportStrategy());
    }
}
