package ru.itsjava.annotations.junit_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyJUnit myJUnit = new MyJUnit(new MyFavoriteTest()); // передаем объект тестового класса
        myJUnit.start();
    }
}
