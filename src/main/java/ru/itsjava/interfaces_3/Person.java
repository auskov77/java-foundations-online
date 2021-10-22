package ru.itsjava.interfaces_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private double age;

//    @Override
//    public int compareTo(Person person) {
//        if (this.name.compareTo(person.name) != 0) {              // проверяем условие значения сравнения name != 0, т.е. name не равны
//            return this.name.compareTo(person.name);              // если name не равны, то вернуть значение сравнения name
//        } else if (this.surname.compareTo(person.surname) != 0) { // иначе проверяем условие сравнения surname != 0, т.е. surname не равны
//            return this.surname.compareTo(person.surname);        // если surname не равны, то вернуть значение surname
//        } else {                                                  // иначе
//            return (int) (this.age - person.age);                 // вернуть разницу сравнения возраста age
//        }
//    }

    @Override
    public int compareTo(Person person) {
        int res = this.name.compareTo(person.name);                 // присвоить res значение сравнения name
        if (this.name.compareTo(person.name) != 0) {                // проверяем условие значения сравнения name != 0, т.е. name не равны
            res = this.surname.compareTo(person.surname);           // если name не равны, то присвоить res значение сравнения surname
        } else if (this.surname.compareTo(person.surname) != 0) {   // иначе проверяем условие сравнения surname != 0, т.е. surname не равны
            res = (int) (this.age - person.age);                    // если surname не равны, то происвоить res значение сравнения age
        }
        return res;                                                 // вернуть значение res
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
