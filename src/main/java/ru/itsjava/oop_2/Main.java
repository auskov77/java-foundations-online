package ru.itsjava.oop_2;

public class Main {

    public static final String VIEW = "Птица";
    public static final String COLOR = "Цветная";
    public static final String HABITAT = "Город";

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

        Birds parrot2 = new Birds(VIEW, COLOR, HABITAT);
        parrot2.toSinging();
        parrot2.toDomestication();
        parrot2.toHunting();
        Birds crow2 = new Birds(VIEW, COLOR, HABITAT);
        crow2.toSinging();
        crow2.toDomestication();
        crow2.toHunting();

    }
}

