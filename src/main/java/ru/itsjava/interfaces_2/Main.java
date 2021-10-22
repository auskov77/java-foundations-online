package ru.itsjava.interfaces_2;

public class Main {
    public static void main(String[] args) {
        Walkable man = new Man();
        man.walk();

        Runnable dog = new Dog();
        dog.run();
        System.out.println(dog.maxRunDistance() + " метров");

        Runnable cat = new Cat();
        cat.run();
        System.out.println(cat.maxRunDistance() + " метров");

        Flyable bird = new Bird();
        bird.fly();
        System.out.println(bird.flyMaxDistance() + " метров");

        Swimable fish = new Fish();
        fish.swim();
        System.out.println(fish.maxSwimSpeed() + " метров");


    }
}
