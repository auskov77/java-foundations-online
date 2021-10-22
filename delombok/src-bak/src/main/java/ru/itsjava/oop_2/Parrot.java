package ru.itsjava.oop_2;

public class Parrot extends Birds {
    public Parrot() {
        super("Попугай Ара", "Очень яркая окраска зелёных, красных, голубых и жёлтых тонов", "Центральная и Южная Америка");
    }

    @Override
    public void toSinging() {
        System.out.println("Способен перенимать песни других видов и имитировать голос человека");
    }

    @Override
    public void toDomestication() {
        System.out.println("Ведут стайный образ жизни в природе");
    }

    @Override
    public void toHunting() {
        System.out.println("Не охотник. Питаются зерновой смесью, различными овощами, фруктами и другими кормами");
    }
}