package ru.itsjava.annotations.junit_2;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objTestClass;
    private int passedTests = 0;
    private int failedTests = 0;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> testMethods = new ArrayList<>();

    @SneakyThrows
    public void start() {
        // вначале считываем аннотации с BeforeAll
        // затем пробежаться по методам - найти аннотации Test
        // в правильном порядке все это запустить

        // смысл такой - вначале пробегаемся по всем аннотация - и распределяем их по коолекциям
        // в зависимости от того BeforeAll, AfterAll, Test и т.п.

        // все методы собираем по отдельным группам
        fillAllMethodsGroup();

        // пробежаться по коллекции beforeAllMethods
        for (Method method : beforeAllMethods) {
            method.invoke(objTestClass);
        }

        // теперь должны пробежаться по тестовым методам
        for (Method method : testMethods) {
            try {
                // получаем кол-во прошедших тестов
                method.invoke(objTestClass); // вызываем объект на объекте нашего тестового класса
                System.out.println(method.getName() + " PASSED!");
                passedTests++;
            } catch (InvocationTargetException exception) {
                // получаем кол-во упавших тестов
                System.out.println(method.getName() + " FAILED!");
                failedTests++;
            }
        }
        printResults(); // cntr+alt+m
    }

    private void fillAllMethodsGroup() { // все методы собираем по отдельным группам
        for (Method method : objTestClass.getClass().getDeclaredMethods()) { // считываем все методы
            if (method.isAnnotationPresent(BeforeAll.class)) { // если BeforeAll, то добавляем в эту коллецию
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) { // если Test, то добавляем в эту коллецию
                testMethods.add(method);
            }
        }
    }


    private void printResults() {
        System.out.println("========================================");
        System.out.println("Кол-во пройденных тестов: " + passedTests);
        System.out.println("Кол-во упавших тестов: " + failedTests);
        System.out.println("========================================");
    }
}

//    Реализовать свои собственные аннотации:
//
// @Before -- запускает метод, помеченный этой аннотацией перед каждым тестом
//
// @After -- запускает метод, помеченный этой аннотацией после каждого теста
//
// @AfterAll -- запускает метод, помеченный этой аннотацией после всех тестов
//
// DisplayName --  передать в строке название теста на русском языке и
// вывести это название перед началом теста