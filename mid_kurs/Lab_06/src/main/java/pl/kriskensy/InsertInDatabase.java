package pl.kriskensy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertInDatabase {

    public static void main(String[] args) {
        Connection connection = Main.getConnection();

        if (connection != null) {

            try {
                String query = "INSERT INTO users(name, surname, salary) VALUES('Maly','Wojownik','1200')";
                Statement statement = connection.createStatement();
                int rowsAffected = statement.executeUpdate(query);
                System.out.println(rowsAffected + " rows affected");

                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}