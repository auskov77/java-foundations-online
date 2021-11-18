package ru.itsjava.collections.lists.arraylist;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList List = new MyArrayList();
        System.out.println(List.size());
        List.add("Привет");
        List.add("Пока");
        System.out.println("После добавления двух элементов размер равен " + List.size());
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        System.out.println("List.size() = " + List.size());

        System.out.println(List);

        System.out.println("List.isEmpty() = " + List.isEmpty());

        System.out.println("List.contains(\"Привет\") = " + List.contains("Привет"));
        System.out.println("List.contains(\"Ок!\") = " + List.contains("Ок!"));

        List.clear();
        System.out.println(List);

        List.add("Привет");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        List.add("Пока");
        System.out.println("List.size() = " + List.size());

        System.out.println(List);

        System.out.println("List.remove(\"Привет\") = " + List.remove("Привет"));

        System.out.println("List.size() = " + List.size());
        System.out.println(List);
        System.out.println("List.remove(\"Пока\") = " + List.remove("Пока"));
        System.out.println(List);

        List.add("До_свидания");
        System.out.println(List);
        System.out.println(List.size());
        List.remove(9);
        System.out.println(List);
        System.out.println(List.size());
        List.remove(1);
        System.out.println(List);

        MyArrayList List2 = new MyArrayList();
        List2.add("element_1");
        List2.add("element_2");
        List2.add("element_3");
        List2.add("element_4");
        System.out.println(List2);
        System.out.println("List2.size() = " + List2.size());

//        List2.remove(1);
//        System.out.println(List2);
//
//        List2.remove(0);
//        System.out.println(List2);

//        List2.remove("element_1");
//        System.out.println(List2);
//        System.out.println("List2.size() = " + List2.size());
//
//        List2.remove("element_3");
//        System.out.println(List2);
//        System.out.println("List2.size() = " + List2.size());

        System.out.println("List2.get(1) = " + List2.get(1));
        System.out.println("List2.get(4) = " + List2.get(3));

        List2.set(0, "e_1");
        System.out.println(List2);

        List2.add(1, "e_2");
        System.out.println(List2);

        List2.add(3, "e_3");
        System.out.println(List2);

        System.out.println("List2.indexOf(\"e_2\") = " + List2.indexOf("e_2"));
        System.out.println("List2.indexOf(\"e_4\") = " + List2.indexOf("e_4"));

        System.out.println(List);
        System.out.println("List.lastIndexOf(\"Пока\") = " + List.lastIndexOf("Пока"));

        System.out.println("List.toArray() = " + Arrays.toString(List.toArray()));
        System.out.println("List2.toArray() = " + Arrays.toString(List2.toArray()));

        MyArrayList List3 = new MyArrayList();
        List3.add(1);
        List3.add(2);
        List3.add(3);
        List3.add(4);
        List3.add(5);
        System.out.println(List3);
        System.out.println(Arrays.toString(List3.subList(1, 3)));

        System.out.println(Arrays.toString(List.subList(1, 3)));

        System.out.println(Arrays.toString(List2.subList(1, 3)));

    }
}
