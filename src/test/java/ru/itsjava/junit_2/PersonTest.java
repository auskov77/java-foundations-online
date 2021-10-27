package ru.itsjava.junit_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    public static final double DEFAULT_AGE = 18;
    public static final String DEFAULT_NAME = "Elena";

    @Test
    public void shouldHaveCorrectConstructor(){
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertAll("actualPerson", () -> assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @Test
    @DisplayName("method birthday")
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

}
//        3. Написать все возможные тесты на этот класс                 - Yes