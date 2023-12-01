package com.laye.springdemo.student;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
	
	
	private StudentService studentService;
	
	@Autowired // inject le service
	public StudentController(@Qualifier("DBStudentService") StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping
	public Student Save(@RequestBody Student student) {
		return this.studentService.save(student);
	}
	
	@GetMapping("/{email}")
	public Student findByEmail(@PathVariable String email) {
		return this.studentService.findByEmail(email);
	}

	@GetMapping
	public List<Student> getAllStudents() {
	
		return studentService.getAllStudents();
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return this.studentService.update(student);
	}
	
	@DeleteMapping("/{email}")
	public void delete(@PathVariable String email) {
		this.studentService.delete(email);
	}

}
