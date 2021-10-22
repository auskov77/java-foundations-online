package ru.itsjava.interfaces_2;

public class Fish implements Swimable{
    @Override
    public void swim() {
        System.out.print("Рыба проплывает ");
    }

    @Override
    public double maxSwimSpeed() {
        return 500.0;
    }
}
