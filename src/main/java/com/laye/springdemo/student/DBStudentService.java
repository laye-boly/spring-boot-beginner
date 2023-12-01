package com.laye.springdemo.student;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service

public class DBStudentService implements StudentService{
	private StudentRepository studentRepository;
	
	public DBStudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.studentRepository.findByEmail(email);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		this.studentRepository.deleteByEmail(email);
		
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return this.studentRepository.save(s);
	}

}
