package ru.itsjava.collections.lists.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {
    MyArrayList List = new MyArrayList();

    @Test
    @DisplayName("Проверка метода isEmpty()")
    public void shouldCorrectMethodIsEmpty() {
        Assertions.assertTrue(List.isEmpty());
        List.add("Privet");
        Assertions.assertFalse(List.isEmpty());
    }

    @Test
    @DisplayName("Проверка метода contains(Object o)")
    public void shouldCorrectMethodContains() {
        List.add("Privet");
        Assertions.assertTrue(List.contains("Privet"));
        Assertions.assertFalse(List.contains("Ok!"));
    }

    @Test
    @DisplayName("Проверка метода clear()")
    public void shouldCorrectMethodClear() {
        List.add("Privet");
        List.add("Poka");
        Assertions.assertFalse(List.isEmpty());
        List.clear();
        Assertions.assertTrue(List.isEmpty());
        Assertions.assertEquals(0, List.size());
    }

    @Test
    @DisplayName("Проверка метода get(int index)")
    public void shouldCorrectMethodGet() {
        List.add("Privet");
        List.add("Poka");
        Assertions.assertEquals("Privet", List.get(0));
    }

    @Test
    @DisplayName("Проверка метода set(int index, Object element)")
    public void shouldCorrectMethodSet() {
        List.add("Privet");
        List.set(0, "e_1");
        Assertions.assertEquals("e_1", List.get(0));
    }

    @Test
    @DisplayName("Проверка метода add(int index, Object element)")
    public void shouldCorrectMethodAdd(){
        List.add("e_1");
        List.add("e_2");
        List.add(1, "Подвинься!");
        Assertions.assertEquals("Подвинься!", List.get(1));
        Assertions.assertEquals("e_2", List.get(2));
    }

    @Test
    @DisplayName("Проверка метода indexOf(Object o)")
    public void shouldCorrectMethodIndexOf(){
        List.add("e_1");
        Assertions.assertEquals(0, List.indexOf("e_1"));
        Assertions.assertEquals(-1, List.indexOf("e_2"));
    }

    @Test
    @DisplayName("Проверка метода lastIndexOf(Object o)")
    public void shouldCorrectMethodLastIndexOf(){
        List.add("e_1");
        List.add("e_1");
        Assertions.assertEquals(1, List.lastIndexOf("e_1"));
        Assertions.assertEquals(-1, List.lastIndexOf("e_2"));
    }

    @Test
    @DisplayName("Проверка метода size()")
    public void shouldCorrectMethodSize(){
        List.add("e_1");
        Assertions.assertEquals(1, List.size());
    }

    @Test
    @DisplayName("Проверка метода remove(Object o)")
    public void shouldCorrectMethodRemove(){
        List.add("e_1");
        Assertions.assertEquals(1, List.size());
        List.remove("e_1");
        Assertions.assertEquals(0, List.size());
    }

    @Test
    @DisplayName("Проверка метода remove(int index)")
    public void shouldCorrectMethodRemoveIndex(){
        List.add("e_1");
        List.add("e_2");
        Assertions.assertEquals(2, List.size());
        List.remove(1);
        Assertions.assertEquals(1, List.size());
    }


}
