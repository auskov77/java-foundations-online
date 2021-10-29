package ru.itsjava.exceptiontask;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;

    public int getAgeInInterval() {
        try {
            return age;
        } catch (ArithmeticException arithmeticException) {
            throw new AgeNotValidException("неверный возраст");
        }
    }
}
//1. Создать класс Person c полями String name и int age.                       - yes
//2. Создать свою ошибку AgeNotValidException                                   - yes
//3. Бросать ошибку в классе Person , если возраст меньше нуля или больше 150   -
// age in the interval - возраст в интервале