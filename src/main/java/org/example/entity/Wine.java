package org.example.entity;

public class Wine extends Alcohol {
    public Wine(double alcoholByVolume) {
        super(alcoholByVolume);
    }

    @Override
    public String toString() {
        return "Wine " + "Alk " + alcoholByVolume + "°";
    }
}
