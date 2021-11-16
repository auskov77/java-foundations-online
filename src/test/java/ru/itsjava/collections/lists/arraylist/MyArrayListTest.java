package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {
    MyArrayList List = new MyArrayList();

    @Test
    @DisplayName("Проверка метода isEmpty()")
    public void shouldCorrectMethodIsEmpty(){
        Assertions.assertTrue(List.isEmpty());
        List.add("Privet");
        Assertions.assertFalse(List.isEmpty());
    }

    @Test
    @DisplayName("Проверка метода contains(Object o)")
    public void shouldCorrectMethodContains(){
        List.add("Privet");
        Assertions.assertTrue(List.contains("Privet"));
        Assertions.assertFalse(List.contains("Ok!"));
    }

    @Test
    @DisplayName("Проверка метода clear()")
    public void shouldCorrectMethodClear(){
        List.add("Privet");
        List.add("Poka");
        Assertions.assertFalse(List.isEmpty());
        List.clear();
        Assertions.assertTrue(List.isEmpty());
    }
}
