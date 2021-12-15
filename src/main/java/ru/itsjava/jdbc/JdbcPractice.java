package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.EmployerDAO;
import ru.itsjava.jdbc.dao.EmployerJdbcImpl;

import java.sql.*;

public class JdbcPractice {
//    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";
//    public static final String DB_LOGIN = "root";
//    public static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("SELECT name, age FROM schema_online_course.employers");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("name") + ":" + resultSet.getString("age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        EmployerDAO dao = new EmployerJdbcImpl();
        System.out.println("dao.findAgeByName(\"tanya\") = " + dao.findAgeByName("tanya"));


    }
}


// 1. Url, login и password к БД    +
// 2. Драйвер в зависимостях        +
// 3. JDBC (встроен внутрь JDK)     +
// 4. Написать свой DAO             +