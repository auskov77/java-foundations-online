package ru.itsjava.junit_2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private double age;

    public double birthday() {
        age = age + 1;
        return age;
    }

    public boolean takeBeer() {
        if (age > 18) {
            return true;
        } else return false;
    }


}
//        1. Написать свой класс Person с полями имя, возраст           - Yes
//        2. Метод void birthday() (который увеличивает возраст на 1)   - Yes
//        и boolean takeBeer(), который проверяет возраст и выдает true
//        если возраст больше 18 и false в ином случае                  - Yes
