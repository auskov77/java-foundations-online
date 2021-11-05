package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        Watch vitaliySeiko = new Watch("Seiko", "Vitaliy", 10_000.0);
        Watch viktorSeiko = new Watch("Seiko", "Victor", 18_000.0);
        Watch dmitriySeiko = new Watch("Seiko", "Dmitriy", 30_000.0);
        Watch valentinOmega = new Watch("Omega", "Valentin", 100_000.0);

        List<Watch> watches = new ArrayList<>(Arrays.asList(vitaliySeiko, viktorSeiko,
                dmitriySeiko, valentinOmega));

        System.out.println("Наши часы: " + watches);

        // Вывести все часы фирмы Seiko
        System.out.println("Вывести все часы фирмы Seiko");
        for (Watch elemWatch : watches) {
            if (elemWatch.getFirm().equals("Seiko")) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        // Вывести все часы у которых цена больше 25_000
        System.out.println("Вывести все часы у которых цена больше 25_000");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25_000) {
                System.out.print(elemWatch + " ");
            }
        }
        System.out.println();

        // Вывести одни часы у которых цена больше 25_000
        System.out.println("Вывести одни часы у которых цена больше 25_000");
        for (Watch elemWatch : watches) {
            if (elemWatch.getPrice() > 25_000) {
                System.out.print(elemWatch + " ");
                break;
            }
        }
        System.out.println();

        // пропустить первые два элемента фирмы Seiko
        int seikoCount = 0;
        System.out.println("Пропустить первые два элемента фирмы Seiko");
        for (int i = 0; i < watches.size()-1; i++) {
            if (watches.get(i).getFirm().equals("Seiko") && seikoCount < 2) {
                seikoCount++;
            } else
                System.out.println(watches.get(i));
        }
        System.out.println();


    }
}
