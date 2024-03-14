package com.student;

public class Student {
	private int id;
	private int age;
	private int courseId;
	private String name;
	public Student(int id, int age, int couseId, String name) {
		super();
		this.id = id;
		this.age = age;
		this.courseId = couseId;
		this.name = name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCouseId(int couseId) {
		this.courseId = couseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id :"+id+"Age: "+age+"courseId:"+courseId+"Student name:"+name;
	}

}
