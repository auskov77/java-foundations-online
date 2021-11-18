package ru.itsjava.collections.lists.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList List = new MyLinkedList();

    @Test
    @DisplayName("Проверка метода int size()")
    void shouldCorrectMethodSize() {
        Assertions.assertEquals(0, List.size());
        List.add("Строка_1");
        Assertions.assertEquals(1, List.size());

    }

    @Test
    @DisplayName("Проверка метода boolean isEmpty()")
    void shouldCorrectMethodIsEmpty() {
        Assertions.assertFalse(List.isEmpty());
        List.add("Строка_1");
        Assertions.assertTrue(List.isEmpty());
    }

    @Test
    @DisplayName("Проверка метода boolean contains(Object o)")
    void shouldCorrectMethodContains() {
        Assertions.assertFalse(List.contains("Строка_1"));
        List.add("Строка_1");
        Assertions.assertTrue(List.contains("Строка_1"));
    }
}