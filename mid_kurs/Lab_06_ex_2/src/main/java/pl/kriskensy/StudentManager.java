package pl.kriskensy;

import java.sql.*;

public class StudentManager {
    private Connection connection;

    public StudentManager(Connection connection) {
        this.connection = connection;
    }

    public void displayStudents() {

        try {
            String selectQuery = "select * from students";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);

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

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(String name, String surname, String studentID, String fieldOfStudy) {

        try {
            String insertQuery = "INSERT INTO STUDENTS (name, surname, student_id, field_of_study) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, studentID);
            preparedStatement.setString(4, fieldOfStudy);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows affected");

            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(int studentNo, String name, String surname, String studentID, String fieldOfStudy) {

        try {
            String updateQuery = "UPDATE STUDENTS SET name = ?, surname = ?, student_ID = ?, field_of_study = ? WHERE no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, studentID);
            preparedStatement.setString(4, fieldOfStudy);
            preparedStatement.setInt(5, studentNo);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows affected");

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int studentNo) {

        try {
            String deleteQuery = "DELETE FROM STUDENTS WHERE no = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, studentNo);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " rows affected");

            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
