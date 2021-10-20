package org.example;

import org.example.entity.Barrel;
import org.example.entity.Beer;
import org.example.entity.Whiskey;
import org.example.entity.Wine;
import org.example.service.BarrelStorageService;



public class Application {
    public static void main(String[] args) {
        BarrelStorageService storageService = new BarrelStorageService();

        Barrel barrel = new Barrel("Just a good wine",20, new Wine(7D),20);
        Barrel barrel_02 = new Barrel("Champagne, harvest of 1092",10, new Wine(5D),9);
        Barrel barrel_03 = new Barrel("Naighbor's brew",30, new Whiskey(50D),20);
        Barrel barrel_04 = new Barrel("light beer",40, new Beer(4D),39);
        Barrel barrel_05 = new Barrel("Pinot noir",20, new Wine(12D),20);
        Barrel barrel_06 = new Barrel("White Horse",20, new Whiskey(40D),20);
        Barrel barrel_07 = new Barrel("Berliner Weisse",16, new Beer(3D),16);
        Barrel barrel_08 = new Barrel("Sauvignon blanc",20, new Wine(16D),3);
        Barrel barrel_09 = new Barrel("Red Ale",20, new Beer(6D),20);
        Barrel barrel_10 = new Barrel("Johnnie Walker",40, new Whiskey(43D),10);

        // помещаем бочки в погреб (п.2 ТЗ)
        storageService.saveBarrel(barrel);
        storageService.saveBarrel(barrel_02);
        storageService.saveBarrel(barrel_03);
        storageService.saveBarrel(barrel_04);
        storageService.saveBarrel(barrel_05);
        storageService.saveBarrel(barrel_06);
        storageService.saveBarrel(barrel_07);
        storageService.saveBarrel(barrel_08);
        storageService.saveBarrel(barrel_09);
        storageService.saveBarrel(barrel_10);

        storageService.saveBarrel(barrel_02);    // пытаемся добавить бочку, которая уже есть (п.2 ТЗ)

        System.out.println("");
        System.out.println(BarrelStorageService.getTitlesList()); // вывод списка всех этикеток (п.4 ТЗ)
        System.out.println("");

        System.out.println(storageService); // список бочек в погребе для проверки

        // ищем существующую бочку и достаем её (п.1 ТЗ)
        System.out.println("");
        storageService.getBarrelByTitle("White Horse");
        System.out.println("");

        // ищем несуществующую бочку и получаем исключение (п.1 ТЗ)
        storageService.getBarrelByTitle("Black Horse");
        System.out.println("");

        System.out.println(storageService); // список всех бочек после удаления одной

        System.out.println(" ");
        System.out.println("All barrels will be removed. Wine cellar will be empty.");
        storageService.getAllBarrels();     // удаляем все бочки из погреба (п.3 ТЗ)

        System.out.println(storageService); // убеждаемся, что все бочки удалены

    }
}
