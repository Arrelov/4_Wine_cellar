package org.example.entity;

public class Beer extends Alcohol {
    public Beer(double alcoholByVolume) {
        super(alcoholByVolume);
    }

    @Override
    public String toString() {
        return "Beer " + "Alk " + alcoholByVolume + "°";
    }
}
