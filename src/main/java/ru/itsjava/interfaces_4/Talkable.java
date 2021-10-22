package ru.itsjava.interfaces_4;

public interface Talkable {
    default void talk() {
        System.out.println("talk");
    }
}
