package org.example.entity;

public class Barrel {
    private final double size;
    private Alcohol alcohol;
    private double currentFilling;

    public Barrel(double size) {
        this.size = size;
    }

    public Barrel(double size, Alcohol alcohol, double currentFilling) {
        this.size = size;
        this.alcohol = alcohol;
        this.currentFilling = currentFilling;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }

    public double getSize() {
        return size;
    }

    public double getCurrentFilling() {
        return currentFilling;
    }

    public void setCurrentFilling(double currentFilling) {
        this.currentFilling = currentFilling;
    }

    @Override
    public String toString() {
        return "Barrel{" +
                "size=" + size +
                ", alcohol=" + alcohol +
                ", currentFilling=" + currentFilling +
                '}';
    }
}
