package org.home.hometask.m3.strategy;

public class MainAirplaneStrategy {
    public static void main(String[] args) {
        Airplane passAirplane = new PassengerAirplane();
        Airplane cargoAirplane = new CargoAirplane();
        Airplane militaryAirplane = new MilitaryAirplane();

        passAirplane.transport();
        cargoAirplane.transport();
        militaryAirplane.transport();
        passAirplane.takeOff();
    }
}
