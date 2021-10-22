package ru.itsjava.statics_2;

public class Main {
    public static void main(String[] args) {
        Car kia = new Car("KIA", "черный");
        Car toyota = new Car("Toyota", "бежевый");
        Car opel = new Car("Opel", "серый");

        System.out.println("Автомобиль = " + kia);
        System.out.println("Автомобиль = " + toyota);
        System.out.println("Автомобиль = " + opel);
    }
}
