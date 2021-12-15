package ru.itsjava.jdbc.dao;

import java.sql.*;

public class EmployerJdbcImpl implements EmployerDAO {
    public static final String DB_URL = "jdbc:MySql://localhost:3306/schema_online_course?serverTimezone=UTC";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "root";

//    @Override
//    public int findAgeByName(String name) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//             Statement statement = connection.createStatement()
//        ) {
//            ResultSet resultSet = statement.executeQuery("select age from schema_online_course.employers " +
//                    "where name = '" + name + "'");
//            resultSet.next();
//            return resultSet.getInt("age");
//
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return -1;
//    }

    @Override
    public int findAgeByName(String name) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement("select age from schema_online_course.employers where name = ?")
        ) {
            preparedStatement.setString(1, "tanya");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
