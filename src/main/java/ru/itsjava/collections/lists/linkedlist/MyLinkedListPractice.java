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

//        List.remove(2);
//        System.out.println("List = " + List);

        List.add("Строка_4");
        System.out.println(List);

        List.clear();
        System.out.println(List);
        System.out.println("List.size() = " + List.size());

        MyLinkedList List3 = new MyLinkedList();
        System.out.println(List3);
        System.out.println("List3.size() = " + List3.size());

//        List.add("Строка_1");
//        List.add("Строка_2");
//        List.add("Строка_3");
//        System.out.println(List);

//        System.out.println("List.get(0) = " + List.get(0));
//        System.out.println("List.get(1) = " + List.get(1));
//        System.out.println("List.get(2) = " + List.get(2));
//
////        List.set(1, "Новая_строка");
////        System.out.println(List);
////
////        List.remove("Строка_1");
////        System.out.println(List);
////        System.out.println("List.remove(\"Строка_4\") = " + List.remove("Строка_4"));
//        System.out.println(List);
//
//        System.out.println("List.indexOf(\"Строка_1\") = " + List.indexOf("Строка_1"));
//        System.out.println("List.indexOf(\"Строка_1\") = " + List.indexOf("Строка_2"));
//        System.out.println("List.indexOf(\"Строка_1\") = " + List.indexOf("Строка_3"));
//        System.out.println("List.indexOf(\"Строка_1\") = " + List.indexOf("Строка_4"));
//
//        MyLinkedList List3 = new MyLinkedList();
//        List3.add("c_1");
//        List3.add("c_1");
//        List3.add("c_1");
//        System.out.println(List3);
//        System.out.println("List3.lastIndexOf(\"c_1\") = " + List3.lastIndexOf("c_1"));
    }
}
