package ru.itsjava.interfaces_2;

public class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.print("Птица пролетает ");
    }

    @Override
    public String flyMaxDistance() {
        return "1000";
    }
}
