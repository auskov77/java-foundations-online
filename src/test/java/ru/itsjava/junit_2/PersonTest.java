package ru.itsjava.junit_2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    public static final double DEFAULT_AGE = 18;
    public static final double NEW_AGE = 19;
    public static final String DEFAULT_NAME = "Elena";

    @Test
    @DisplayName("method birthday")
    void birthday() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        assertEquals(DEFAULT_AGE + 1, actualPerson.birthday());
    }

    @Test
    @DisplayName("Method takeBeer")
    void takeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        System.out.println("method takeBeer() = " + actualPerson.takeBeer());
    }

    @Test
    @DisplayName("Method getName")
    void getName() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        System.out.println("actualPerson.getName() = " + actualPerson.getName());
    }

    @Test
    @DisplayName("Method getAge")
    void getAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(NEW_AGE);
        assertEquals(NEW_AGE, actualPerson.getAge());
        System.out.println("actualPerson.getAge() = " + actualPerson.getAge());
    }

    @Test
    @DisplayName("Method setAge")
    void setAge() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(DEFAULT_AGE);
        assertEquals(DEFAULT_AGE, actualPerson.getAge());
        System.out.println("actualPerson.getAge() = " + actualPerson.getAge());
    }

    @Test
    @DisplayName("Method testEquals")
    void testEquals() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.equals(actualPerson);
        System.out.println("actualPerson.equals(actualPerson) = " + actualPerson.equals(actualPerson));
    }

    @Test
    @DisplayName("Method canEqual")
    void canEqual() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.canEqual(actualPerson);
        System.out.println("actualPerson.canEqual(actualPerson) = " + actualPerson.canEqual(actualPerson));
    }

    @Test
    @DisplayName("Method testHashCode")
    void testHashCode() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.hashCode();
        System.out.println("actualPerson.hashCode() = " + actualPerson.hashCode());
    }

    @Test
    @DisplayName("Method testToStrin")
    void testToString() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.toString();
        System.out.println("actualPerson.toString() = " + actualPerson.toString());
    }
}
//        3. Написать все возможные тесты на этот класс                 - Yes