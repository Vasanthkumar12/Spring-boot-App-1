package com.SpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class StudentController {     /*Jackson file la O/P venum na POJO class(Student) la Constructor
									   Create pannitu, adhai Controller class(StudentController) la POJO 
	                                   class Object Create panni Student i return pannanum*/
	//Idhuvum oru Rest API aamm.
	
	//Single http Request
	//Ex -> http://localhost:8080/student
	@GetMapping("/student")
	  public Student getStundent() {
		 return new Student("Vasanth","Kumar");
	}
	//List of Request
	//Ex -> http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Vasant","Kumar"));
		students.add(new Student("Ranjith","Kumar"));
		students.add(new Student("Bharathi","Kannamma"));
		students.add(new Student("Muthu","Samy"));
		students.add(new Student("Siva","Prakash"));
		students.add(new Student("Karthi","Keyan"));
		students.add(new Student("Ranjith","Sharma"));
		students.add(new Student("Rith","rma"));
		
		return students;
	}
	//PathVariable annotation
	//Example -> https://localhost:8080/student/ramesh/kumar(Here ramesh and kumar are the "PathVariables")
	@GetMapping("/student/{firstName}/{lastName}")
	public Student pathVariable(@PathVariable("firstName") String fName,
								@PathVariable("lastName")String lName){
		return new Student(fName,lName);
	}
	
	@GetMapping("/student/{firstName}/{lastName}/{age}")
	public Student pathVariable(@PathVariable("firstName") String fName,
								@PathVariable("lastName")String lName,@PathVariable("age")int age){
		return new Student(fName,lName,age);
    }
	
	//How to handle Request Parameters
	//Ex -> http://localhost:8080/student/query?firstName=Ram&lastName=Kumar
	@GetMapping("/student/query")
	public Student getRequestParam(
			@RequestParam(name="firstName")String fName,
			@RequestParam(name="lastName")String lName) {
		return new Student(fName,lName); 
		
	}
}
