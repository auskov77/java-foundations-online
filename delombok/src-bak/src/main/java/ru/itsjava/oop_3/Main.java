package ru.itsjava.oop_3;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        CarDriver driver4th = new Driver4thCategory();
        System.out.println("Водитель автомобиля - " + driver4th.toString());
        driver4th.toEliminationMalfunctions();
        System.out.println();

        CarDriver driver5th = new Driver5thCategory();
        System.out.println("Водитель автомобиля - " + driver5th.toString());
        driver5th.toEliminationMalfunctions();
    }
}
