package ru.itsjava.collections.lists.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
        Assertions.assertTrue(List.isEmpty());
        List.add("Строка_1");
        Assertions.assertFalse(List.isEmpty());
    }

    @Test
    @DisplayName("Проверка метода boolean contains(Object o)")
    void shouldCorrectMethodContains() {
        Assertions.assertFalse(List.contains("Строка_1"));
        Assertions.assertFalse(List.contains("Строка_2"));
        List.add("Строка_1");
        List.add("Строка_2");
        Assertions.assertTrue(List.contains("Строка_1"));
        Assertions.assertTrue(List.contains("Строка_2"));
    }

    @Test
    @DisplayName("Проверка метода void clear()")
    void shouldCorrectMethodClear() {
        List.add("Строка_1");
        List.add("Строка_2");
        Assertions.assertEquals(2, List.size());
        List.clear();
        Assertions.assertEquals(0, List.size());
    }

    @Test
    @DisplayName("Проверка метода Object get(int index)")
    void shouldCorrectMethodGet() {
        List.add("Строка_1");
        List.add("Строка_2");
        List.add("Строка_3");
        Assertions.assertEquals("Строка_1", List.get(0));
        Assertions.assertEquals("Строка_2", List.get(1));
        Assertions.assertEquals("Строка_3", List.get(2));
    }

    @Test
    @DisplayName("Проверка метода Object set(int index, Object element)")
    void shouldCorrectMethodSet() {
        List.add("Строка_1");
        List.add("Строка_2");
        List.add("Строка_3");
        List.set(1, "Новая_строка");
        Assertions.assertEquals("Строка_1", List.get(0));
        Assertions.assertEquals("Новая_строка", List.get(1));
        Assertions.assertEquals("Строка_3", List.get(2));
    }

    @Test
    @DisplayName("Проверка метода int indexOf(Object o)")
    void shouldCorrectMethodIndexOf() {
        List.add("Строка_1");
        List.add("Строка_2");
        Assertions.assertEquals(0, List.indexOf("Строка_1"));
        Assertions.assertEquals(1, List.indexOf("Строка_2"));
        Assertions.assertEquals(-1, List.indexOf("Строка_3"));
    }

    @Test
    @DisplayName("Проверка метода int lastIndexOf(Object o)")
    void shouldCorrectMethodLastIndexOf() {
        List.add("Строка_1");
        List.add("Строка_1");
        List.add("Строка_1");
        Assertions.assertEquals(2, List.lastIndexOf("Строка_1"));
    }
}