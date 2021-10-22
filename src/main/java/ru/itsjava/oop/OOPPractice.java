package ru.itsjava.oop;

public class OOPPractice {

    public static void main(String[] args) {
        Phone phone = new IPhone();
        
        System.out.println("phone = " + phone.toString());

        Phone phone2 = new IPhone();
        System.out.println("phone2 = " + phone2.toString());

        System.out.println(phone==phone2);

        System.out.println("phone.equals(phone2) = " + phone.equals(phone2));

        phone = phone2;

        System.out.println("phone.equals(phone2) = " + phone.equals(phone2));
    }


}
