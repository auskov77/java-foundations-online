package ru.itsjava.statics_2;

import lombok.Data;

@Data
public class Car {
    private final String brand;
    private final String color;
    private final static double COST = 500_000.0;

    public Car(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public String toString(){
        return " Марка: " + brand + ", Цвет: " + color + ", Стоимость: " + COST;
    }

}

