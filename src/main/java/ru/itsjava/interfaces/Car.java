package ru.itsjava.interfaces;

public abstract class Car { //абстрактный класс это класс и на нем запрещено множественное наследование
    private System myPrivateField; // можно создать поле, в интерфейсе приватные поля создавать нельзя

    abstract void getCarMake();

    public void seetInTheCar(){
        System.out.println("So good seats!");
    }
}
