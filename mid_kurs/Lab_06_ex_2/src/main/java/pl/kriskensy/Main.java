package pl.kriskensy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/students_db";
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

            StudentManager studentManager = new StudentManager(connection);

            studentManager.displayStudents();
            System.out.println();
            studentManager.addStudent("Staszek", "Fistaszek", "SF111", "Law");
            //studentManager.updateStudent(7,"Jacek","Placek", "JP222", "Psychology");

            //studentManager.deleteStudent(6);

            studentManager.displayStudents();

            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}