package ru.itsjava.collections.lists.listsPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private final String name;
    private String author;
    private int numberPages;
}
//    Создать класс Книга (C полями: Название, Автор, количество страниц)