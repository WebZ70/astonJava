package org.home.hometask.m3.builder;

public class Barrel {
    private final String name;
    private final int volume;
    private final String storedMaterial;
    private final String madeMaterial;

    Barrel(BarrelBuilder builder) {
        name = builder.name;
        volume = builder.volume;
        storedMaterial = builder.storedMaterial;
        madeMaterial = builder.madeMaterial;
    }

    public String getName(){
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String getStoredMaterial() {
        return storedMaterial;
    }

    public String getMadeMaterial() {
        return madeMaterial;
    }

    static class BarrelBuilder {
        private final String name;
        private final String madeMaterial;
        private final int volume;
        private String storedMaterial;

        public BarrelBuilder(String name, String madeMaterial, int volume) {
            this.name = name;
            this.madeMaterial = madeMaterial;
            this.volume = volume;
        }

        public BarrelBuilder setStoredMaterial(String storedMaterial) {
            this.storedMaterial = storedMaterial;
            return this;
        }

        public Barrel build() {
            return new Barrel(this);
        }

    }
}
