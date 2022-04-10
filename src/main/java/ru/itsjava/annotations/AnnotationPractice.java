package ru.itsjava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationPractice {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        Person ivan = new Person("Vanya", true);
//        System.out.println(ivan);
//
//        Class<? extends Person> aClass = ivan.getClass();
//
//        System.out.println(aClass.getName());
//        System.out.println(aClass.getSimpleName());

        // вот пример, где НЕ используется оператор new
        // создаем объект левым образом
        // т.е. берем у класса его конструктор, через getConstructor
        // через рефлексию считываем его, говорим какие типы будут - какой именно нас конструтор интересует
        // берем у него newInstance
        // т.о. создаем объект в обход всего
        // Это и есть темная магия ООП
        Class<?> personClass = Class.forName("ru.itsjava.annotations.Person");
        System.out.println(personClass.getName());
        Person vanya = (Person) personClass.getConstructor(String.class, Boolean.TYPE) // если примитивные типы данных, то используйте TYPE, если ссылочный - class
                .newInstance("Vanya", true);
        System.out.println(vanya);

        // можно через рефлексию считать аннотацию
        System.out.println(personClass.getAnnotations()[0]);

        // рефлекшн помогает нам сломать поле private boolean isGood
        Field isGood = personClass.getDeclaredField("isGood");
        isGood.setAccessible(true); // обращение к полю без private
        isGood.setBoolean(vanya, false);

        System.out.println(vanya);
    }
}

