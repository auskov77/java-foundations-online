package ru.itsjava.annotations.mypractice;

import lombok.Getter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        MathStudent ivanov = new MathStudent("Ivan", "Ivanov","History");
//        System.out.println(ivanov);




        Class<?> studentMathClass = Class.forName("ru.itsjava.annotations.mypractice.MathStudent");
        MathStudent ivanov = (MathStudent) studentMathClass.getConstructor(String.class, String.class, String.class)
                .newInstance("Ivan", "Ivanov", "2");
        System.out.println(ivanov);

        Field ivan = studentMathClass.getDeclaredField("firstname");
        ivan.setAccessible(true);
        ivan.set(ivanov, "Petr");

        System.out.println(ivanov);
        System.out.println();
        System.out.println(studentMathClass.getAnnotations()[0]);
        System.out.println();
        NameDepartment nameDepMath = MathStudent.class.getAnnotation(NameDepartment.class);

        System.out.println("Студент: " + ivanov.getFirstname() + ", " + ivanov.getLastname() + ", " + "курс: " + ivanov.getCoorse() + ", " + nameDepMath.message());
        System.out.println();

        Class<?> studentBiologyClass = Class.forName("ru.itsjava.annotations.mypractice.BiologyStudent");
        BiologyStudent semenov = (BiologyStudent) studentBiologyClass.getConstructor(String.class, String.class, String.class)
                .newInstance("Semen", "Semenov", "4");

        System.out.println(studentBiologyClass.getAnnotations()[0]);
        System.out.println();
        NameDepartment nameDepBio = BiologyStudent.class.getAnnotation(NameDepartment.class);
        System.out.println("Студент: " + semenov.getFirstname() + ", " + semenov.getLastname() + ", " + "курс: " + semenov.getCoorse() + ", " + nameDepBio.message());



    }
}

//1. Создать свой собственный класс MathStudent с полями Имя, фамилия и курс.   +
//2. Создать объект класса MathStudent.                                         +
//3. Через Reflection вытащить private поле и поменять ему значение на новое.   +
//4. Создать свой собственный класс BiologyStudent с полями Имя, фамилия и курс +
//5. Создать свою аннотацию в. которую будем передавать имя кафедры             +
//6. Проанотировать классы этой аннотацией.                                     +
//7. Получить аннотацию через рефлекшн и                                        +
// вывести на экран студента и название кафедры из аннотации.                   +
