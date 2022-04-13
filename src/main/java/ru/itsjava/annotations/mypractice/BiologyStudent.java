package ru.itsjava.annotations.mypractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@NameDepartment(message = "Кафедра Биологии")
@AllArgsConstructor
@ToString
@Getter
public class BiologyStudent {
    private final String firstname;
    private final String lastname;
    private final String course;
}
