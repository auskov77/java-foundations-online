package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {
    private Node head;

    public int size() {
        // если head не null, то
        // пробежать по всему циклу по всему списку
        // увеличить count на 1. Проверять чему равен метод count, он возвращает кол-во элементов
        // если есть только head то будет count = 1
        int count = 1;
        if (head == null) {
            return 0;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                count++;
            }
            return count;
        }
    }

    public boolean isEmpty() {
        // проверить head на null, если head не равен null, то head не пустой
        return head != null;
    }

    public boolean contains(Object o) {
        // пробегаемся по нашему LinkedList
        // сравниваем НЕ Node == o, а Node.getValue(), т.е. должны обратиться к значению Node
        if (head == null) {
            return false;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                if (head.getValue().equals(o)) {
                    break;
                }
                curNode = curNode.getNext();
            }
            return true;
        }
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }

        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        Node curNode = head;
        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
            head = null;
        }
    }

    public Object get(int index) {
        checkIndex(index);

        Node curNode = head;
        for (int i = 0; i < index; i++) {
            if (curNode.getNext() == null)
                return null;
            curNode = curNode.getNext();
        }
        return curNode.getValue();

//        Node curNode = head;
//        Object resValue = head;
//        int count = 0;
//        while (curNode.getNext() != null) {
//            if (count == index){
//                resValue = curNode.getValue();
//                break;
//            }
//            curNode = curNode.getNext();
//            count++;
//        }
//        return resValue;
    }

    public Object set(int index, Object element) {
        checkIndex(index);

        int i = 0;
        Node curNode = head;
        while (i < index) {
            curNode = curNode.getNext();
            i++;
        }
        Object resValue = curNode.getValue();
        curNode.setValue(element);
        return resValue;
    }

    public void add(int index, Object element) {

    }

    // СТРОКА_1 -> null
    // СТРОКА_1 -> СТРОКА_2 -> СТРОКА_3 -> null
    public Object remove(int index) {
        checkIndex(index); // проверка корректности по индексу
        // если хотим удалить первый элемент с индексом 0
        if (index == 0) { // проверка условия если индекс index равен 0, если условие верно то удаляем head
            Object resValue = head.getValue(); // создаем элемент resValue и присваем ему значение нашего head
            if (head.getNext() == null) { // проверка условия, если нет никаких ссылок на null, т.е. следующий элемент не пустой
                head = null; // присваиваем head пустое значение null
            } else { // иначе, если в списке не только head
                head = head.getNext(); // передвигаем на следующий элемент - присвоить элементу head значение следующее по ссылке head.getNext()
            }
            return resValue; // вернуть тот элемент, который удалили
        }
        // если значение index НЕ 0, т.е. объект где-то в середине списка
        // нам необходимо переназначить ссылку на следующий за удаляемым элемент
        // для этого пробегаемся по списку
        Node curNode = head; // создаем текущий элемент списка curNode и присваеваем ему head
        Node prevNode = head; // предыдущий элемент списка prevNode это Node до curNode
        int count = 0; // создаем переменную count и присваем ему значение 0
        while ((curNode = curNode.getNext()) != null) { // бежим по циклу до значения curNode не равное null - перемещаем значение curNode
            count++; // переменную count увеличиваем на 1, т.о. сохраняем значение элемента curNode, который хотим удалить
            if (count == index) { // проверяем условеи равенства count и индекса index
                break; // если условие выполняется, то выйти из цикла
            }
            prevNode = prevNode.getNext(); // перемещаем наш prevNode
        }
        // теперь надо сделать удаление
        // для этого надо проверить где находится значение curNode
        assert curNode != null;
        Object resValue = curNode.getValue(); // объекту resValue присваем значение curNode
        // если в конце списка
        if (curNode.getNext() == null) { // проверяем условие равенства последнего элемента curNode и null
            prevNode.setNext(null); // удаляем ссылку - если условие выполняется, то предыдущему элементу prevNode присваем значение null
        } else {
            // если значение в середине списка
            prevNode.setNext(curNode.getNext()); // здесь перенаправляем ссылку - у предыдущего элемента prevNode присваеваем ссылку текущего curNode
            curNode.setNext(null); // удаляем ссылку от текущего элемента
        }
        return resValue; // возвращаем значение resValue
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        // проверяем что (index > -1) && (index < realSize)
        return (index > -1) && (index < size());
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
