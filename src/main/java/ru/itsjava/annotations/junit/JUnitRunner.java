package ru.itsjava.annotations.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class JUnitRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // создать экземпляр этого класса
        // потом пробежаться по аннотациям
        // вытащить аннотации
        // вытащить методы, над которыми есть аннотация @Test
        // и соответственно запустить
        // ну и проверить что все ОК

        // создадаим явно MyFavoriteTest
        MyFavoriteTest myFavoriteTest = new MyFavoriteTest();

        // теперь хотим получить все методы, которые есть. JUnit будет работать только с public,ами
        Method[] methodsMyFavoriteTest = MyFavoriteTest.class.getDeclaredMethods();

//        System.out.println(Arrays.toString(methodsMyFavoriteTest));

        int passedTests = 0;
        int failedTests = 0;

        // далее пробегаемся по всем этим методам
        // соответственно вызвать все эти методы
        // проверить есть ли аннотации и т.д. см.выше
        for (Method method : methodsMyFavoriteTest) {
            if (method.isAnnotationPresent(Test.class)) { // если аннотация есть, то вызываем этот метод
                System.out.println(method.getName());
                try {
                    // получаем кол-во прошедших тестов
                    method.invoke(myFavoriteTest);
                    System.out.println(method.getName() + " PASSED!");
                    passedTests++;
                } catch (InvocationTargetException exception){
                    // получаем кол-во упавших тестов
                    System.out.println(method.getName() + " FAILED!");
                    failedTests++;
                }

            }

        }

        System.out.println("Кол-во пройденных тестов: " + passedTests);
        System.out.println("Кол-во упавших тестов: " + failedTests);
    }
}
