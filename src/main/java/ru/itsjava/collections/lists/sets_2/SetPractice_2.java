package ru.itsjava.collections.lists.sets_2;

import ru.itsjava.collections.lists.sets.Man;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice_2 {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple", 100);
        Fruit pear = new Fruit("Pear", 150);
        Fruit plum = new Fruit("Plum", 50);

        Set<Fruit> fruitSet = new HashSet<>(Arrays.asList(apple, pear, plum));

        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.size() = " + fruitSet.size());

        Fruit cherry = new Fruit("Cherry", 10);
        fruitSet.add(cherry);
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.size() = " + fruitSet.size());

        System.out.println("fruitSet.add(apple) = " + fruitSet.add(apple));
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.size() = " + fruitSet.size());

        fruitSet.remove(cherry);
        System.out.println("fruitSet = " + fruitSet);
        System.out.println("fruitSet.size() = " + fruitSet.size());

        System.out.println("fruitSet.contains(apple) = " + fruitSet.contains(apple));
        System.out.println("fruitSet.contains(cherry) = " + fruitSet.contains(cherry));

    }
}
