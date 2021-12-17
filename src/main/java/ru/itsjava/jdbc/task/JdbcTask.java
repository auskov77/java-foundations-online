package ru.itsjava.jdbc.task;

import ru.itsjava.jdbc.task.daotask.UserDAO;
import ru.itsjava.jdbc.task.daotask.UserJdbcImpl;

public class JdbcTask {
    public static void main(String[] args) {
        UserDAO dao = new UserJdbcImpl();
        System.out.println("dao.getAgeByUserName(\"vasyan\") = " + dao.getAgeByUserName("vasyan"));
    }
}
