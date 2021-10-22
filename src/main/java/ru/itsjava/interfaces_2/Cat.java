package ru.itsjava.interfaces_2;

public class Cat implements Runnable{
    @Override
    public void run() {
        System.out.print("Кошка пробегает ");
    }

    @Override
    public int maxRunDistance() {
        return 50;
    }
}
