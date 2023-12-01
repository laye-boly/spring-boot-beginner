package com.laye.springdemo.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String firstName;
	private String lastName;
	
	

	@Column(unique=true)
	private String email;
	private LocalDate date;
	
	@Transient
	private int age;

	public Student() {

	}

	public Student(String firstName, String lastName, String email, LocalDate date, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.date = date;
		this.age = age;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getAge() {
		return Period.between(this.date, LocalDate.now()).getYears();
	}

	public void setAge(int age) {
		this.age = age;
	}

}
