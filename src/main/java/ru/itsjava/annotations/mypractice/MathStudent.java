package ru.itsjava.annotations.mypractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@NameDepartment(message = "Кафедра Математики")
@AllArgsConstructor
@ToString
@Getter
public class MathStudent {
    private final String firstname;
    private final String lastname;
    private final String course;

}
