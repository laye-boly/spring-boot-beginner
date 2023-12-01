package com.laye.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InMemoryStudentService implements StudentService{
	private final InMemoryStudentDao inMemoryStudentDao;
	
	public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
		this.inMemoryStudentDao = inMemoryStudentDao;
	}
	
	@Override
	public List<Student> getAllStudents() {
		return this.inMemoryStudentDao.getAllStudents();
		
	}

	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return this.inMemoryStudentDao.save(student);
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.inMemoryStudentDao.findByEmail(email);
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		this.inMemoryStudentDao.delete(email);
		
	}

	@Override
	public Student update(Student s) {
		// TODO Auto-generated method stub
		return this.inMemoryStudentDao.update(s);
	}

}
