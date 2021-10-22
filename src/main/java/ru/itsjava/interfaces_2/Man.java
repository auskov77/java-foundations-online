package ru.itsjava.interfaces_2;

public class Man implements Walkable{


    @Override
    public void walk() {
        System.out.println("Человек идет по городу");
    }
}
