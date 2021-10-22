package ru.itsjava.oop_2;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Birds parrot = new Parrot();
        System.out.println("Птица = " + parrot.toString());
        parrot.toSinging();
        parrot.toDomestication();
        parrot.toHunting();
        System.out.println();

        Birds crow = new Crows();
        System.out.println("Птица = " + crow.toString());
        crow.toSinging();
        crow.toDomestication();
        crow.toHunting();
    }
}

