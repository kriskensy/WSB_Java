package pl.kriskensy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFromDatabase {

    public static void main(String[] args) {
        Connection connection = Main.getConnection();

        if (connection != null) {

            try {
                String query = "select * from users";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String surname = resultSet.getString("surname");
                    int salary = resultSet.getInt("salary");

                    System.out.println("id: " + id + " " + name + " " + surname + ", salary: " + salary);
                }

                resultSet.close();
                statement.close();
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
