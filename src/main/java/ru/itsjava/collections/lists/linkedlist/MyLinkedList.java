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
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
