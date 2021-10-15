package org.example.entity;

public class Whiskey extends Alcohol {
    public Whiskey(double alcoholByVolume) {
        super(alcoholByVolume);
    }

    @Override
    public String toString() {
        return "Whiskey";
    }
}
