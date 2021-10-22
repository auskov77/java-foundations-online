package ru.itsjava.interfaces_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person dad = new Person("Igor", "Ivanov", 75);
        Person father = new Person("Petr", "Ivanov", 50);
        Person neighbour = new Person("Petr", "Sidorov", 65);
        Person brother = new Person("Ivan", "Semenov", 75);

        if (dad.compareTo(father) == 0) {
            System.out.println("Dad & Father это один и тот же человек");
        } else System.out.println("Dad & Father это разные люди");

        if (dad.compareTo(neighbour) == 0) {
            System.out.println("Dad & Neighbur это один и тот же человек");
        } else System.out.println("Dad & Neighbur это разные люди");

        if (brother.compareTo(dad) == 0) {
            System.out.println("Brother & Dad это один и тот же человек");
        } else System.out.println("Brother & Dad это разные люди");

        Person brother_2 = (Person) brother.clone();

        Person[] persons = {brother, neighbour, father, dad};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        System.out.println("Brother = " + brother);
        System.out.println("Brother_2 = " + brother_2);

        if (brother.compareTo(brother_2) == 0) {
            System.out.println("Brother & Brother_2 это один и тот же человек");
        } else System.out.println("Brother & Brother_2 это разные люди");

    }
}
//1. Создать класс Person ( Поля: Имя, Фамилия и возраст)                                                                   - Yes
//        2. Реализовать интерфейс Comparable. Реализовать метод compareTo(),
//        который будет сравнивать человека по фамилии, если фамилии одинаковые, то по имени, в ином случае по возрасту.    - Yes
//        3. В классе Main добавить в массив несколько человек. Отсортировать и вывести на экран.                           - Yes
//        4. В классе Person реализовать метод clone()                                                                      - Yes
//        5. В классе Main создать клона некоторого Person.                                                                 - Yes