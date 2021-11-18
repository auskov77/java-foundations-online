package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {

        MyLinkedList List = new MyLinkedList();

        List.add("Строка_1");
        System.out.println("List = " + List);

        List.add("Строка_2");
        System.out.println("List = " + List);

        List.add("Строка_3");
        System.out.println("List = " + List);

        System.out.println("List.size() = " + List.size());

        System.out.println("List.isEmpty() = " + List.isEmpty());

        MyLinkedList List2 = new MyLinkedList();
        System.out.println("List2.isEmpty() = " + List2.isEmpty());

        System.out.println("List.contains(\"Строка_1\") = " + List.contains("Строка_1"));
        System.out.println("List2.contains(\"Строка_1\") = " + List2.contains("Строка_1"));

    }
}
