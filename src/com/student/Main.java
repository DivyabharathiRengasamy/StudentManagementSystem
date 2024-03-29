package com.student;

import java.sql.SQLException;
import java.util.*;
import java.util.List;
import java.util.Scanner;

import com.student.service.StudentManagementSytem;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		StudentManagementSytem studentManagementSytem=new StudentManagementSytem();
		while(true) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter your choice \n1.Add Student\n2.View student\n3.Update student\n4.Delete student");
		int userOption=scan.nextInt();
		int id;
		int age;
		int courseId;
		String studentName;
	
		switch(userOption) {
		case 1:
			System.out.println("Enter the student id");
			 id=scan.nextInt();
			System.out.println("Enter the student name");
			studentName=scan.next();
			scan.nextLine();
			System.out.println("Enter the student course id");
			
			courseId=scan.nextInt();
			System.out.println("Enter the student age");
			 age=scan.nextInt();
			studentManagementSytem.addStudent(id, age, courseId, studentName);
			System.out.println("Student Details added successfully");
			break;
		case 2:
			studentManagementSytem.getAllStudents();
			
			break;
		case 3:
			System.out.println("Enter the student id");
			 id=scan.nextInt();
			System.out.println("Enter the new student name");
			studentName=scan.next();
			studentManagementSytem.updateStudent(id,studentName);
			break;
		case 4:
			System.out.println("Enter the student id");
			 id=scan.nextInt();
			studentManagementSytem.deleteStudent(id);
			break;
		default: 
		System.out.println("please select proper input");
		}
	}
		
	}
	}


