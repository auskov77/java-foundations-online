package ru.itsjava.collections.lists.arraylist;

import java.util.Arrays;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() { // возвращает true, если этот список не содержит элементов
        return realSize == 0;
    }

    public boolean contains(Object o) { // Возвращает true, если данный элемент присутствует в множестве
        boolean resContains = false;
        for (int i = 0; i < realSize; i++) {
            if ((array[i] == o) && (array[i] != null)) {
                resContains = true;
                break;
            }
        }
        return resContains;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        //вставка нашего элемента
        array[realSize++] = o; // вставил последний элемент и увеличиваем на 1
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() { // используется для очистки коллекции, для которой он вызывается
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
