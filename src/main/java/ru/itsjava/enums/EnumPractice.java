package ru.itsjava.enums;

public class EnumPractice {
    public static void main(String[] args) {

        System.out.println("Season.WINTER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season : seasons){
            System.out.print(season + " ");
        }
        System.out.println();

        Season season = Season.SPRING;
        switch (season){
            case FALL:
                System.out.println("У нас ОСЕНЬ");
                break;
            case WINTER:
                System.out.println("У нас ЗИМА");
                break;
            default:
                System.out.println("У нас не ЗИМА и не ОСЕНЬ");
        }

        System.out.println(Coffee.AMERICANO);
        System.out.println(Coffee.AMERICANO.getCharacteristic());
    }
}
