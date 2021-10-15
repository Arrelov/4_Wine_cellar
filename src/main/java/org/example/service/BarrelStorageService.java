package org.example.service;

import org.example.entity.Barrel;

import java.util.*;

public class BarrelStorageService {
    private final Queue<Barrel> barrels = new ArrayDeque<>(20);

    public Barrel getBarrel() {
        return barrels.poll();
    }

    public void saveBarrel(Barrel barrel){
        barrels.add(barrel);
    }

    @Override
    public String toString() {
        return "BarrelStorageService. " +
                "Barrels now is: " + "\n{" + barrels +
                '}';
    }
}
