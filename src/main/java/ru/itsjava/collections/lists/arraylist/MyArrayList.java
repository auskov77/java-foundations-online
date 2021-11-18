package ru.itsjava.collections.lists.arraylist;

import java.util.List;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int newSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        newSize = 0;
    }

    public int size() {
        return newSize;
    }

    public boolean isEmpty() { // возвращает true, если этот список не содержит элементов
        return newSize == 0;
    }

    public boolean contains(Object o) { // Возвращает true, если данный элемент присутствует в множестве
        boolean resContains = false;
        for (int i = 0; i < newSize; i++) {
            if ((array[i] == o) && (array[i] != null)) {
                resContains = true;
                break;
            }
        }
        return resContains;
    }

//    public Iterator iterator() { // позволяет циклически проходить через коллекцию, получать или удалять элементы
//
//        return null;
//    }

    public Object[] toArray() { // Возвращает массив, содержащий все элементы в этом списке в правильном порядке
        Object[] newArray = new Object[newSize]; // создаем объект newArray размером realSize
        System.arraycopy(array, 0, newArray, 0, newSize); // цикл от 0 до realSize где каждому элементу newArray[i] присваиваем элемент array[i]
        return newArray;    // возвращаем массив newArray
    }

//    public Object[] toArray(Object[] a) { // Возвращает массив, содержащий все элементы в этом списке в правильном порядке; тип выполнения возвращаемого массива - тип указанного массива
//        if (a.length < realSize){ // проверяем условие где длин объекта а меньше значения realSize
//            return (Object[]) Arrays.copyOf(array, realSize, a.getClass());} // возвращаем объект а
//        System.arraycopy(array, 0, a, 0, realSize); // цикл от 0 до realSize где каждому элементу а[i] присваиваем элемент array[i]
//        if (a.length > realSize){ // проверка условия где длина объекта а больше realSize
//            a[realSize] = null; // если условие выполняется, то длина а обнуляется
//        }
//        return a; // возвращаем объект а
//    }

    public boolean add(Object o) {
        if (newSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        //вставка нашего элемента
        array[newSize++] = o; // вставил последний элемент и увеличиваем на 1
        return true;
    }

    public boolean remove(Object o) {               // удаляем объект о из списка
//        if (o == null) {                            // проверка условия что объект о не пустой
//            for (int i = 0; i < realSize; i++) {    // цикл от 0 до realSize с шагом 1 - проверка элементов массива
//                if (array[i] == null){              // проверка условия что элемент массива с индексом i не пустой
//                    remove(i);                      // удаляем элемент с индексом i
//                    return true;                    // возвращаем истину
//                }
//            }
//        }else {                                     // иначе
//            for (int i = 0; i < realSize; i++) {    // цикл от 0 до realSize с шагом 1 - проверка элементов массива
//                if (o.equals(array[i])){            // проверка условия что объект о совпадает с элементом массива i
//                    remove(i);                      // удаляем элемент с индексом i
//                    return true;                    // возвращаем истину
//                }
//            }
//        }
//        return false;                               // возвращаем ложь

        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }
        newSize--;
        return true;
    }


//    public boolean addAll(Collection c) { // Добавляет все элементы из c в коллекцию
//        int arrayLength = array.length;
//        int cLength = c.size();
//        newlSize = arrayLength + cLength;
//        Object[] newArray = new Object[newlSize];
//        for (int i = 0; i < newlSize; i++) {
//            newArray[i] = array[i];
//        }
//        for (int i = 0; i < newlSize; i++) {
//            newArray[newlSize-cLength] = c[i];
//        }
//        return true;
//    }

//    public boolean addAll(int index, Collection c) { //Вставляет все элементы из коллекции c в позицию по указанному индексу
//        return false;
//    }
//
//    public void sort(Comparator c) { // Сортирует элементы во всем списке с использованием указанного сравнения
//        List.super.sort(c);
//    }
//
//    public boolean retainAll(Collection c) { // Оставляет в коллекции только те элементы, которые также присутствуют в коллекции c , удаляя все остальные
//        return false;
//    }
//
//    public boolean removeAll(Collection c) { // Удаляет из коллекции все элементы, которые присутствуют в c
//        return false;
//    }
//
//    public boolean containsAll(Collection c) { // Возвращает true, если коллекция содержит все элементы из c
//        return false;
//    }

    public void clear() { // используется для очистки коллекции, для которой он вызывается
        for (int i = 0; i < newSize; i++) {
            array[i] = null;
        }
        newSize = 0;
    }

    public Object get(int index) { // получить элемент по указанному индексу
        checkIndex(index);

        return array[index];
    }

    public Object set(int index, Object element) { // устанавить элемент в указанную позицию
        checkIndex(index);

        Object resElement = array[index];
        array[index] = element;

        return resElement;
    }

    public void add(int index, Object element) { // добавить элемент на указанную позицию
        checkIndex(index);

//        if (newSize + 1 >= capacity) { //если в массиве места нет
//            increasingArrayCapacity(); //вызываем метод, который отвечает за увеличение массива
//        }
        if (newSize + 1 - index >= 0) System.arraycopy(array, index - 1, array, index, newSize + 1 - index);
        array[index] = element;
        newSize++;
    }

    // метод для увеличения емкости массива
    private void increasingArrayCapacity() {
        capacity = (newSize * 3) / 2 + 1;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = array[i];
            array[i] = null;
        }
        array = newArray;
    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        newSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        // проверяем что (index > -1) && (index < realSize)
        return (index > -1) && (index < newSize);
    }

    public int indexOf(Object o) { // возвращает индекс первого вхождения указанного объекта o
        for (int i = 0; i < newSize; i++) { // пробегаемся по списку от 0 до realSize с шагом 1
            if (o.equals(array[i])) { // условие совпадения объекта о со значением элемента списка
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) { // возвращает индекс последнего вхождения указанного значения в строковый объект String, на котором он был вызван, или -1, если ничего не было найдено
        for (int i = newSize; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public Object[] subList(int fromIndex, int toIndex) { // возвращает список от fromIndex до toIndex
        newSize = toIndex - fromIndex + 1;
        int j = 0;
        Object[] newArray = new Object[newSize];
        for (int i = fromIndex; i < toIndex + 1; i++) {
            newArray[j] = array[i];
            j++;
        }
        return newArray;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < newSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
