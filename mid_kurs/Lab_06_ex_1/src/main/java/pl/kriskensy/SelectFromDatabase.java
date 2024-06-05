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
                String query = "select * from students";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int no = resultSet.getInt("No");
                    String name = resultSet.getString("name");
                    String surname = resultSet.getString("surname");
                    String studentID = resultSet.getString("student_id");
                    String fieldOfStudy = resultSet.getString("field_of_study");

                    System.out.println("No: " + no + " " + name + " " + surname + ", " + studentID + ", " + fieldOfStudy);
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
