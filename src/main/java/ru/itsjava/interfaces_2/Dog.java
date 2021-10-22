package ru.itsjava.interfaces_2;

public class Dog implements Runnable{

    @Override
    public void run() {
        System.out.print("Собака пробегает ");
    }

    @Override
    public int maxRunDistance() {
        return 100;
    }
}
