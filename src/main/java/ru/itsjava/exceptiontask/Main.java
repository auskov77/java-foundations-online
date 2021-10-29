package ru.itsjava.exceptiontask;

public class Main {
    public static void main(String[] args) {

        Person man = new Person("Alex", 50);
        Person woman = new Person("Elena", 18);
        Person nobody = new Person("Nobody", 200);

        try {
            if ((man.getAge() >= 0) & (man.getAge() <= 150)) {
                System.out.print(man.getName() + ", возраст = " + man.getAge());
                man.getAgeInInterval();
            }
        } catch (AgeNotValidException an) {
            if ((man.getAge() < 0) | (man.getAge() > 150)) {
                System.out.println("Возраст меньше нуля или больше 150");
                an.printStackTrace();
            }
        }
        System.out.println();

        try {
            if ((woman.getAge() >= 0) & (woman.getAge() <= 150)) {
                System.out.print(woman.getName() + ", возраст = " + woman.getAge());
                woman.getAgeInInterval();
            }
        } catch (AgeNotValidException an) {
            if ((woman.getAge() < 0) | (woman.getAge() > 150)) {
                System.out.println("Возраст меньше нуля или больше 150");
                an.printStackTrace();
            }
        }
        System.out.println();

        try {
            if ((nobody.getAge() >= 0) & (nobody.getAge() <= 150)) {
                System.out.print(nobody.getName() + ", возраст = " + nobody.getAge());
                nobody.getAgeInInterval();
            }
        } catch (AgeNotValidException an) {
            if ((nobody.getAge() < 0) | (nobody.getAge() > 150)) {
                System.out.println("Возраст меньше нуля или больше 150");
                an.printStackTrace();
            }
        }
    }
}

