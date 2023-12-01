package com.laye.springdemo.student;

import java.util.List;

public interface StudentService {
	
	Student save(Student student);
	
	 List<Student> getAllStudents() ;
	 
	 Student findByEmail(String email);
	 
	 void delete(String email);
	 
	 Student update(Student s);

}
