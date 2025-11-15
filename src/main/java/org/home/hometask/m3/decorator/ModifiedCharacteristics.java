package org.home.hometask.m3.decorator;

public class ModifiedCharacteristics implements CharacteristicsBolide{
    private final CharacteristicsBolide bolide;
    private final int maxSpeed;
    private final double rotationAngleWheels;

    ModifiedCharacteristics(CharacteristicsBolide bolide, int maxSpeed, double rotationAngleWheels) {
        this.bolide = bolide;
        this.maxSpeed = maxSpeed;
        this.rotationAngleWheels = rotationAngleWheels;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed + bolide.getMaxSpeed();
    }

    @Override
    public double getRotationAngleWheels() {
        return this.rotationAngleWheels + bolide.getRotationAngleWheels();
    }

    @Override
    public String toString() {
        return "Максимальная скорость: " + getMaxSpeed() + " " +
                "Угол поворота: " + getRotationAngleWheels();
    }
}
