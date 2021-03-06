package org.example.entity;

public class Barrel {
    private String title;           // этикетка
    private final double size;      // объем бочки
    private Alcohol alcohol;        // тип напитка в бочке
    private double currentFilling;  // текущий остаток напитка в бочке

    public Barrel(double size) {
        this.size = size;
    }

    public Barrel(String title, double size, Alcohol alcohol, double currentFilling) {
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\n" + "Barrel titled \"" + title + "\"" + " {" +
                "size= " + size +
                ", alcohol= " + alcohol +
                ", currentFilling= " + currentFilling +
                '}';
    }
}
