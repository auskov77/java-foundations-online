package ru.itsjava.collections.lists.arraylist;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
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

    public boolean remove(Object o) {               // удаляем объект о из списка
        if (o == null) {                            // проверка условия что объект о не пустой
            for (int i = 0; i < realSize; i++) {    // цикл от 0 до realSize с шагом 1 - проверка элементов массива
                if (array[i] == null){              // проверка условия что элемент массива с индексом i не пустой
                    remove(i);                      // удаляем элемент с индексом i
                    return true;                    // возвращаем истину
                }
            }
        }else {                                     // иначе
            for (int i = 0; i < realSize; i++) {    // цикл от 0 до realSize с шагом 1 - проверка элементов массива
                if (o.equals(array[i])){            // проверка условия что объект о совпадает с элементом массива i
                    remove(i);                      // удаляем элемент с индексом i
                    return true;                    // возвращаем истину
                }
            }
        }
        return false;                               // возвращаем ложь
    }

    public void clear() { // используется для очистки коллекции, для которой он вызывается
        for (int i = 0; i < realSize; i++) {
            array[i] = null;
        }
        realSize = 0;
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

        if (realSize + 1 >= capacity) { //если в массиве места нет
            increasingArrayCapacity(); //вызываем метод, который отвечает за увеличение массива
        }
        if (realSize + 1 - index >= 0) System.arraycopy(array, index - 1, array, index, realSize + 1 - index);
        array[index] = element;
        realSize++;
    }

    // метод для увеличения емкости массива
    private void increasingArrayCapacity() {
        capacity = realSize + 1;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < realSize; i++) {
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
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        // проверяем что (index > -1) && (index < realSize)
        return (index > -1) && (index < realSize);
    }

    public int indexOf(Object o) { // возвращает индекс первого вхождения указанного объекта o
        for (int i = 0; i < realSize; i++) { // пробегаемся по списку от 0 до realSize с шагом 1
            if (o.equals(array[i])) { // условие совпадения объекта о со значением элемента списка
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) { // возвращает индекс последнего вхождения указанного значения в строковый объект String, на котором он был вызван, или -1, если ничего не было найдено
        for (int i = realSize; i >= 0; i--) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
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
