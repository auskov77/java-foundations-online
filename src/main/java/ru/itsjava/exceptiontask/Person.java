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
