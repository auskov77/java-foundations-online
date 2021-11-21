package ru.itsjava.collections.lists.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Man andrey = new Man("Andrey");
        Man maxim = new Man("Maxim");
        Man vitya = new Man("Vitya");

        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
        System.out.println("manSet = " + manSet);

        Man andrey_2 = new Man("Andrey");
        System.out.println("manSet.add(andrey_2) = " + manSet.add(andrey_2));
        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));

        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
        System.out.println("manSet.remove(andrey_2) = " + manSet.remove(andrey_2));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.remove(andrey) = " + manSet.remove(andrey));
        System.out.println("manSet = " + manSet);

        System.out.println("manSet.size() = " + manSet.size());
    }
}
