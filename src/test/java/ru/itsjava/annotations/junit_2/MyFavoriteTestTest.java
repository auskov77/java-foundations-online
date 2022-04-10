package ru.itsjava.annotations.junit_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFavoriteTestTest {

    @DisplayName("Тест перед всеми методами")
    @Test
    void beforeAllMethod() {
    }

    @DisplayName("Тест перед методом")
    @Test
    void beforeMethod() {
    }

    @DisplayName("Тест после метода")
    @Test
    void afterMethod() {
    }

    @DisplayName("Тест после всех методов")
    @Test
    void afterAllMethod() {
    }

    @DisplayName("Тест №1")
    @Test
    void test1() {
    }

    @DisplayName("Тест №2")
    @Test
    void test2() {
    }

    @DisplayName("Тест №3")
    @Test
    void test3() {
    }

    @DisplayName("Тест №4")
    @Test
    void test4() {
    }

    @DisplayName("Пустой тест")
    @Test
    void noTestMethod() {
    }
}