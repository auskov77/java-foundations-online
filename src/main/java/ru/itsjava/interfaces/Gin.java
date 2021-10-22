package ru.itsjava.interfaces;

public class Gin implements Creatable{ // создали класс Gin

    @Override //аннотация на компиляции проверяет действительно ли мы переопределили метод который определен в интерфейсе
    public void createWish() { //реализовали метод, сигнатурв такая же как в классе Creatable
        System.out.println("Слушаю и повинусь!");// некоторая реализация
    }
}
