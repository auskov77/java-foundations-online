package ru.itsjava.junit_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person boy = new Person("Petr", 15);
        Person man = new Person("Alex", 49);
        Person girl = new Person("Nata", 18);
        Person woman = new Person("Elena", 38);

        Person[] persons = {boy, man, girl, woman};
        System.out.println(Arrays.toString(persons));

        boy.birthday();
        man.birthday();
        girl.birthday();
        woman.birthday();

        System.out.println(Arrays.toString(persons));

        System.out.println("boy.takeBeer() = " + boy.takeBeer());
        System.out.println("man.takeBeer() = " + man.takeBeer());
        System.out.println("girl.takeBeer() = " + girl.takeBeer());
        System.out.println("woman.takeBeer() = " + woman.takeBeer());
    }
}
