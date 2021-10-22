package ru.itsjava.statics_3;

public class Main {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(10);
        Circle circle_2 = new Circle(21.5);

        circle_1.getCircleName();
        System.out.print(circle_1);
        System.out.println();
        circle_2.getCircleName();
        System.out.print(circle_2);
        System.out.println();

    }
}
