package ru.itsjava.enums.Practice;

import java.util.Scanner;

public class MyEnumPractice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели");
        int menuNum = console.nextInt();

        switch (menuNum){
            case 1:
//                System.out.println(Weekday.MONDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.MONDAY);
                break;
            case 2:
//                System.out.println(Weekday.TUESDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.TUESDAY);
                break;
            case 3:
//                System.out.println(Weekday.WEDNESDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.WEDNESDAY);
                break;
            case 4:
//                System.out.println(Weekday.THURSDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.THURSDAY);
                break;
            case 5:
//                System.out.println(Weekday.FRIDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.FRIDAY);
                break;
            case 6:
//                System.out.println(Weekday.SATURDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.SATURDAY);
                break;
            case 7:
//                System.out.println(Weekday.SUNDAY.getTranslationOfTheDayOfTheWeek());
                System.out.println(Weekday.SUNDAY);
                break;
            default:
                System.out.println("Введен некорректный порядковый номер дня недели!!!!!!");
        }

    }
}

//1. Создать Перечисление Дни недели                                    - yes
//2. Создать конструктор с входящим параметром переводом дня недели     - yes
//3. Переопределить метод toString                                      - yes