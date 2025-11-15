package org.home.hometask.m3.decorator;

public abstract class ModifiedCharacteristics implements CharacteristicsBolide{
    private final CharacteristicsBolide bolide;
    private final int changeMaxSpeed;
    private final double changeRotationAngleWheels;

    ModifiedCharacteristics(CharacteristicsBolide bolide, int changeMaxSpeed, double changeRotationAngleWheels) {
        this.bolide = bolide;
        this.changeMaxSpeed = changeMaxSpeed;
        this.changeRotationAngleWheels = changeRotationAngleWheels;
    }

    @Override
    public int getChangeMaxSpeed() {
        return this.changeMaxSpeed + bolide.getChangeMaxSpeed();
    }

    @Override
    public double getRotationAngleWheels() {
        return this.changeRotationAngleWheels + bolide.getRotationAngleWheels();
    }

    @Override
    public String toString() {
        return "Максимальная скорость: " + getChangeMaxSpeed() + " " +
                "Угол поворота: " + getRotationAngleWheels();
    }
}
