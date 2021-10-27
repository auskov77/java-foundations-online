package ru.itsjava.junit_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    public static final double DEFAULT_AGE = 18;
    public static final double NEW_AGE = 19;
    public static final String DEFAULT_NAME = "Elena";

    @Test
    public void shouldHaveCorrectConstructor(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @Test
    @DisplayName("Method birthday")
    public void shouldHaveCorrectMethodBirthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_AGE + 1, actualPerson.birthday());
    }

    @Test
    @DisplayName("Method takeBeer")
    public void shouldHaveCorrectMethodTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertFalse(actualPerson.takeBeer());
    }

    @Test
    @DisplayName("Корректно изменять возраст")
    public void shouldHaveCorrectUpdateAge(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(NEW_AGE);
        assertEquals(NEW_AGE, actualPerson.getAge());
    }

}
//        3. Написать все возможные тесты на этот класс                 - Yes