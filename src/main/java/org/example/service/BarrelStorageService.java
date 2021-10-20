package org.example.service;

import org.example.entity.Barrel;
import org.example.exception.AlreadyExistsBarrelException;
import org.example.exception.NoSuchTitleException;

import java.util.*;

public class BarrelStorageService {
    static final ArrayList<Barrel> barrels = new ArrayList<>(20);

    public Barrel getBarrel(int index) {
        return barrels.remove(index);
    }

    public int titleExists(String title1) {         // если бочка есть, вернем её индекс
        for (int unite = 0; unite < barrels.size(); unite++) {
            if (barrels.get(unite).getTitle() == title1) {
                return unite;
            }
        }
        return -1 ; // если бочка с такой этикеткой не найдена, возвращаем -1
    }

    public void getBarrelByTitle(String title) {
//        System.out.println(barrels.indexOf("Как это сделать???"));
        System.out.println("Search for barrel with label \"" + title + "\" : ");
        try {
            System.out.println("Barrel found. Remove barrel :" + gbbTitle(title));
        } catch (NoSuchTitleException nsle) {
            //System.out.println("No barrel with such title in the wine cellar");
            System.out.println(nsle);
            //nsle.printStackTrace();   // выводит сообщение об ошибке в "случайном" месте
        }
    }

    public Barrel gbbTitle(String title) throws NoSuchTitleException {
        if (titleExists(title) > 0) {
            return barrels.remove(titleExists(title));
        } else {
            throw new NoSuchTitleException("No barrel with such title in the wine cellar");
        }
    }

    public void saveBarrel (Barrel barrel) {
        try {
            sBarrel(barrel);
        } catch (AlreadyExistsBarrelException aee) {
            System.out.print("Such title is already exists in wine cellar, cant add: ");
            System.out.println(barrel);
            System.out.println(aee);
            //aee.printStackTrace();    // выводит сообщение об ошибке в "случайном" месте
        }
    }

    public void sBarrel(Barrel barrel) throws AlreadyExistsBarrelException {
        if (titleExists(barrel.getTitle()) > 0 ) {
            throw new AlreadyExistsBarrelException("Such barrel is already exists in wine cellar");
            }
        barrels.add(barrel);
    }

     public static String getTitlesList() {          // вывод списка всех этикеток
        System.out.println("    *The list of all titles:");
        for (Barrel item1 : barrels){
            System.out.println(item1.getTitle());
        }
        return "    *End of the list of titles";
    }

    public static void getAllBarrels() {
        barrels.clear();
    }

    @Override
    public String toString() {
        return "BarrelStorageService. " +
                "Barrels now is: " + "\n{" + barrels +
                '}';
    }
}
