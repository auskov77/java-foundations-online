package ru.itsjava.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {
    private final String login;
    private final transient String password;
}