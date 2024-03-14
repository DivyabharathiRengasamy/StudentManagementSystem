package com.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.Student;
import com.student.database.DbConnection;

public class StudentManagementSytem {

    List<Student> students = new ArrayList<>();

    // Create operation - Add a new student
    public void addStudent(int id, int age, int courseId, String name) throws ClassNotFoundException, SQLException {
        students.add(new Student(id, age, courseId, name));
        Connection connection = DbConnection.getConnection();
        String query = "INSERT INTO studentList VALUES (?,?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, courseId);
        preparedStatement.setInt(4, age);
        preparedStatement.execute();
        connection.close();
    }

    public List<Student> getAllStudents() {
        for (Student student : students) {
            System.out.println("Your name " + student.getName() + " your age " + student.getAge() + " your courseId " + student.getCourseId() + " your id " + student.getId());
        }
        return new ArrayList<>(students);
    }

    public void updateStudent(int id, String newName) throws ClassNotFoundException, SQLException {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                System.out.println("Your name " + student.getName() + " is successfully updated in data structure ");
            }
        }
        Connection connection = DbConnection.getConnection();
        String updateQuery = "UPDATE studentList SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
        preparedStatement.setString(1, newName);
        preparedStatement.setInt(2, id);
        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student with ID " + id + " updated successfully with new name: " + newName);
        } else {
            System.out.println("No student found with ID: " + id);
        }
        preparedStatement.close();
        connection.close();
    }

    // Delete operation - Remove a student
    public void deleteStudent(int id) throws ClassNotFoundException, SQLException {
        String deleteQuery = "DELETE FROM studentList WHERE id = ?";
        Connection connection = DbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, id);
        int rows = preparedStatement.executeUpdate();
        if (rows > 0) {
            System.out.println("1 rows affected");
        } else {
            System.out.println("no data found");
        }
        students.removeIf(student -> student.getId() == id);

        for (Student student : students) {
            System.out.println("your data is successfully deleted in data structure");
            System.out.println("Your name " + student.getName() + " your age " + student.getAge() + " your courseId " + student.getCourseId() + " your id " + student.getId());
        }
    }
}
