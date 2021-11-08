package ru.itsjava.exceptiontask;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private String name;
    private int age;

    public int getAgeInInterval() {
        if ((age < 0) || (age > 150)) {
            throw new AgeNotValidException("неверный возраст");
        }
        return age;
    }
}
