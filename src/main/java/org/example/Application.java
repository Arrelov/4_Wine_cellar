package org.example;


import org.example.entity.Barrel;
import org.example.entity.Wine;
import org.example.service.BarrelStorageService;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        BarrelStorageService storageService = new BarrelStorageService();

        Barrel barrel = new Barrel(20, new Wine(7D),20);

        for (int i = 0; i<10; i++){
            storageService.saveBarrel(barrel);
        }

        System.out.println(storageService);

        Barrel someBarrel = storageService.getBarrel();
        System.out.println(someBarrel);

        Barrel someBarrel2 = storageService.getBarrel();
        System.out.println(someBarrel2);

        System.out.println(storageService);


    }
}
