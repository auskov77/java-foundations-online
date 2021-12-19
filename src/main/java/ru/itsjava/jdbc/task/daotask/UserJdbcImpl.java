package ru.itsjava.jdbc.task.daotask;

import java.sql.*;

public class UserJdbcImpl implements UserDAO {
    public static final String MY_DB_URL = "jdbc:MySql://localhost:3306/schema_users_messages?serverTimezone=UTC";
    public static final String MY_DB_LOGIN = "*";
    public static final String MY_DB_PASSWORD = "*";

    @Override
    public int getAgeByUserName(String name) {
        try (Connection connection = DriverManager.getConnection(MY_DB_URL, MY_DB_LOGIN, MY_DB_PASSWORD);
             PreparedStatement preparedStatement =
                     connection.prepareStatement("select age from schema_users_messages.users where name = ?")
        ) {
            preparedStatement.setString(1, "vasyan");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            return resultSet.getInt("age");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

}
