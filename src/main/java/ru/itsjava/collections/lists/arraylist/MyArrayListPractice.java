package ru.itsjava.collections.lists.arraylist;

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

    }
}
