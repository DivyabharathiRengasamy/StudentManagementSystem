package com.student;

public class Student {
	int id;
	int age;
	int couseId;
	String name;
	public Student(int id, int age, int couseId, String name) {
		super();
		this.id = id;
		this.age = age;
		this.couseId = couseId;
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
	public int getCouseId() {
		return couseId;
	}
	public void setCouseId(int couseId) {
		this.couseId = couseId;
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
		return "id :"+id+"Age: "+age+"courseId:"+couseId+"Student name:"+name;
	}

}
