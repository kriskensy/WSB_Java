package pl.kriskensy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/ticket_system";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established!");

        } catch (SQLException e) {
            System.out.println("Connection do DB impossible.");
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {

        Connection connection = getConnection();
        if (connection != null) {

            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}