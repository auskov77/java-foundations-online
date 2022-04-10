package ru.itsjava.annotations.junit_2;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class MyFavoriteTest {

    @DisplayName(message = "Тест перед всеми методами")
    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("BEFORE ALL");
    }

    @DisplayName(message = "Тест перед методом")
    @Before
    public void beforeMethod(){
        System.out.println("BEFORE TEST");
    }

    @DisplayName(message = "Тест после метода")
    @After
    public void afterMethod(){
        System.out.println("AFTER METHOD");
    }

    @DisplayName(message = "Тест после всех методов")
    @AfterAll
    public void afterAllMethod(){
        System.out.println("AFTER ALL METHODS");
    }

    @DisplayName(message = "Тест №1")
    @Test
    public void test1(){}

    @DisplayName(message = "Тест №2")
    @Test
    public void test2(){}

    @DisplayName(message = "Тест №3")
    @Test
    public void test3(){
        throw new RuntimeException();
    }

    @DisplayName(message = "Тест №4")
    @Test
    public void test4(){
        throw new RuntimeException();
    }

    public void noTestMethod(){}


}
