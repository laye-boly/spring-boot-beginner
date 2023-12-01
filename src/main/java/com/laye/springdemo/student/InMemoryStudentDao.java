package com.laye.springdemo.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryStudentDao {

	private List<Student> students = new ArrayList<Student>();
	
	
	public List<Student> getAllStudents() {
		//students.add(new Student("laye", "boly", "email", LocalDate.now(), 45));
		return students;
		
	}

	
	public Student save(Student student) {
		// TODO Auto-generated method stub
		this.students.add(student);
		return student;
	}


	public Student findByEmail(String email) {
		return this.students.stream().filter(s -> s.getEmail().equals(email)).findFirst().orElse(null);
	
	}


	public void delete(String email) {
		var student = findByEmail(email);
		if(student != null) {
			students.remove(student);
		}
		
	}


	public Student update(Student s) {
		var studentIndex = IntStream.range(0, students.size()).filter(index -> students.get(index).getEmail().equals(s.getEmail())).findFirst().orElse(-1);
		
		if(studentIndex > - 1) {
			students.set(studentIndex, s);
			return s;
		}
		return null;
	}

}
