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
    private final List<Method> beforeMethods = new ArrayList<>();
    private final List<Method> afterMethods = new ArrayList<>();
    private final List<Method> afterAllMethods = new ArrayList<>();

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
        for (Method methodBeforeAll : beforeAllMethods) {
            DisplayName displayName = methodBeforeAll.getAnnotation(DisplayName.class);
            System.out.println(displayName.message());
            methodBeforeAll.invoke(objTestClass);
        }

        // теперь должны пробежаться по тестовым методам
        for (Method methodTest : testMethods) {
            DisplayName displayNameTest = methodTest.getAnnotation(DisplayName.class);
            System.out.println(displayNameTest.message());
            try {
                for (Method methodBefore : beforeMethods) {
                    DisplayName displayName = methodBefore.getAnnotation(DisplayName.class);
                    System.out.println(displayName.message());
                    methodBefore.invoke(objTestClass);
                }
                // получаем кол-во прошедших тестов
                methodTest.invoke(objTestClass); // вызываем объект на объекте нашего тестового класса
                System.out.println(methodTest.getName() + " PASSED!");
                passedTests++;
                for (Method methodAfter : afterMethods) {
                    DisplayName displayName = methodAfter.getAnnotation(DisplayName.class);
                    System.out.println(displayName.message());
                    methodAfter.invoke(objTestClass);
                }
            } catch (InvocationTargetException exception) {
                // получаем кол-во упавших тестов
                System.out.println(methodTest.getName() + " FAILED!");
                failedTests++;
                for (Method methodAfter : afterMethods) {
                    DisplayName displayName = methodAfter.getAnnotation(DisplayName.class);
                    System.out.println(displayName.message());
                    methodAfter.invoke(objTestClass);
                }
            }
        }

        for (Method methodAfterAll : afterAllMethods) {
            DisplayName displayName = methodAfterAll.getAnnotation(DisplayName.class);
            System.out.println(displayName.message());
            methodAfterAll.invoke(objTestClass);
        }
        printResults(); // cntr+alt+m
    }

    private void fillAllMethodsGroup() { // все методы собираем по отдельным группам
        for (Method method : objTestClass.getClass().getDeclaredMethods()) { // считываем все методы
            if (method.isAnnotationPresent(BeforeAll.class)) { // если BeforeAll, то добавляем в эту коллецию
                beforeAllMethods.add(method);
            } else if (method.isAnnotationPresent(Test.class)) { // если Test, то добавляем в эту коллецию
                testMethods.add(method);
            } else if (method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            } else if (method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            } else if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethods.add(method);
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
// @Before -- запускает метод, помеченный этой аннотацией перед каждым тестом   +
// @After -- запускает метод, помеченный этой аннотацией после каждого теста    +
// @AfterAll -- запускает метод, помеченный этой аннотацией после всех тестов   +
// @DisplayName --  передать в строке название теста на русском языке и         +
// вывести это название перед началом теста                                     +