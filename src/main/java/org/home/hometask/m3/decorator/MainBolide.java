package org.home.hometask.m3.decorator;

import java.util.Arrays;
import java.util.List;

public class MainBolide {
    public static void main(String[] args) {
        CharacteristicsBolide characteristicsBolide = new BaseCharacteristicsBolide(320, 7.3);
        System.out.println("DRS выкл: " + characteristicsBolide.toString());

        CharacteristicsBolide activeDRS = new DragReductionSystem(characteristicsBolide);
        System.out.println("DRS вкл: " + activeDRS.toString());


    }
}
