package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyArrayListTest {
    MyArrayList List = new MyArrayList();

    @Test
    @DisplayName("Проверка метода isEmpty()")
    public void shouldCorrectMethodIsEmpty(){
        Assertions.assertTrue(List.isEmpty());
    }

    @Test
    @DisplayName("Проверка метода contains(Object o)")
    public void shouldCorrectMethodContains(){
        List.add("Privet");
        Assertions.assertTrue(List.contains("Privet"));
    }

    @Test
    @DisplayName("Проверка метода clear()")
    public void shouldCorrectMethodClear(){
        Assertions.assertTrue(List.isEmpty());
    }
}
