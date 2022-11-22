package com.clone.method;

public class Student implements Cloneable{
	
	int id;
	
	String name;
	
	public Student(int id ,String name) {
		this.id= id;
		this.name= name;
	}

	void display() {
		System.out.println("Id :"+ id);
		System.out.println("Name :"+ name);
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student student1 = new Student(10,"om");
		student1.display();
		
		Student student2 =(Student) student1.clone();
		student2.name= "shivani";
		student2.display();
		
		//student1.display();
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}
