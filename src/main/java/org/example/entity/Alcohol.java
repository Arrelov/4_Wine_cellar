package org.example.entity;

public abstract class Alcohol {
    protected final double alcoholByVolume;

    public Alcohol(double alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }

    public double getAlcoholByVolume() {
        return alcoholByVolume;
    }

    @Override
    public abstract String toString();
}
