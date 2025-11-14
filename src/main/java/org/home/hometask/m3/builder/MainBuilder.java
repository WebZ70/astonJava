package org.home.hometask.m3.builder;

import java.util.Arrays;
import java.util.List;

public class MainBuilder {
    public static void main(String[] args) {
        Barrel barrel = new Barrel.BarrelBuilder("Barrel 1967", "Wood", 10).setStoredMaterial("Wine").build();
        Barrel barrel1 = new Barrel.BarrelBuilder("Barrel 1918", "Steel", 40).build();

        List<Barrel> barrels = Arrays.asList(barrel, barrel1);
        barrels.stream()
                .peek(n -> System.out.println(n.getName()))
                .forEach(n -> System.out.println(
                        "Made: " + n.getMadeMaterial() +
                                ", StoredMaterial: " + n.getStoredMaterial() +
                                ", Volume: " + n.getVolume()
                ));
    }
}
