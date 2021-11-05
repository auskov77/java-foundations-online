package ru.itsjava.collections.lists.listsPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private int age;
    private final String isMale;
}

