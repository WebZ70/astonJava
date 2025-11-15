package org.home.hometask.m3.decorator;

public class BaseCharacteristicsBolide implements CharacteristicsBolide {
    private final int maxSpeed;
    private final double rotationAngleWheels;

    public BaseCharacteristicsBolide(int maxSpeed, double rotationAngleWheels) {
        this.maxSpeed = maxSpeed;
        this.rotationAngleWheels = rotationAngleWheels;
    }

    @Override
    public int getChangeMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public double getRotationAngleWheels(){
        return this.rotationAngleWheels;
    }

    @Override
    public String toString() {
        return "Максимальная скорость: " + getChangeMaxSpeed() + " " +
                "Угол поворота: " + getRotationAngleWheels();
    }
}
