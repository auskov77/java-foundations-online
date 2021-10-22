package ru.itsjava.interfaces_4;

public interface Eatable {
    default void eat() {
        System.out.println("eat");
    }
}
