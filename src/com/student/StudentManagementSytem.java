package com.student;

import java.util.*;

public class StudentManagementSytem {
	
List<Student>students=new ArrayList();

// Create operation - Add a new student
public void addStudent(int id, int age, int courseId, String name) {
    students.add(new Student(id, age, courseId, name));
}

// Read operation - Retrieve all students
public List<Student> getAllStudents() {
	for(Student student:students) {
		  System.out.println("Your name "+student.getName()+" your age "+student.getAge()+" your courseId "+student.getCouseId()+" your id "+student.getId());
	}
    return new ArrayList<>(students); 
}

// Update operation - Update student information
public void updateStudent(int id, int newAge, int newCourseId, String newName) {
    for (Student student : students) {
        if (student.getId() == id) {
            student.setAge(newAge);
            student.setCouseId(newCourseId);
            student.setName(newName);
            System.out.println("Your updated name "+student.getName()+" your updated age "+student.getAge()+" your updated courseId "+student.getCouseId());
            return; 
        }
    }
   
}

// Delete operation - Remove a student
public void deleteStudent(int id) {
	
    students.removeIf(student -> student.getId() == id);
    System.out.println( id+"id sucessuflly deleted");
} 
}
