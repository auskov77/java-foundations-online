package ru.itsjava.exceptiontask;

public class Main {
    public static void main(String[] args) {

        Person man = new Person("Alex", 50);
        Person woman = new Person("Elena", 18);
        Person nobody = new Person("Nobody", 200);


        try {
            System.out.println(man.getName() + ", возраст = " + man.getAgeInInterval());
        } catch (AgeNotValidException ageNotValidException) {
            System.out.print(man.getName() + " = возраст меньше нуля или больше 150 " + ageNotValidException);
        }

        try {
            System.out.println(woman.getName() + ", возраст = " + woman.getAgeInInterval());
        } catch (AgeNotValidException ageNotValidException) {
            System.out.print(woman.getName() + " = возраст меньше нуля или больше 150 " + ageNotValidException);
        }

        try {
            System.out.println(nobody.getName() + ", возраст = " + nobody.getAgeInInterval());
        } catch (AgeNotValidException an) {
            System.out.print(nobody.getName() + " = возраст меньше нуля или больше 150 ");
            an.printStackTrace();
        }
//
//        try {
//            if ((man.getAge() > 0) & (man.getAge() < 150)) {
//                System.out.println(man.getName() + ", возраст = " + man.getAgeInInterval());
//            } else
//                throw new AgeNotValidException("неверный возраст");
//        } catch (AgeNotValidException an) {
//            System.out.println(man.getName() + " = возраст меньше нуля или больше 150");
//            an.printStackTrace();
//        }
//
//        try {
//            if ((woman.getAge() > 0) & (woman.getAge() < 150)) {
//                System.out.println(woman.getName() + ", возраст = " + woman.getAgeInInterval());
//            } else
//                throw new AgeNotValidException("неверный возраст");
//        } catch (AgeNotValidException an) {
//            if ((woman.getAge() <= 0) | (woman.getAge() >= 150)) {
//                System.out.println(woman.getName() + " = возраст меньше нуля или больше 150");
//                an.printStackTrace();
//            }
//        }
//
//        try {
//            if ((nobody.getAge() > 0) & (nobody.getAge() < 150)) {
//                System.out.println(nobody.getName() + ", возраст = " + nobody.getAgeInInterval());
//            }
//            throw new AgeNotValidException("неверный возраст");
//        } catch (AgeNotValidException an) {
//            if ((nobody.getAge() <= 0) | (nobody.getAge() >= 150)) {
//                System.out.println(nobody.getName() + " = возраст меньше нуля или больше 150");
//                an.printStackTrace();
//            }
//        }
    }
}

