package com.SpringBoot;

public class Student {          /*Jackson file la O/P venum na POJO class(Student) la Constructor Create
								pannitu, adhai Controller class(StudentController) la POJO class Object 
								Create panni Student i return pannanum*/
	private String FirstName;
	private String LastName;
	private int Age;
	
	public Student(String firstName, String lastName) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
	}
	public Student(String firstName, String lastName, int age) {

		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
	}	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
