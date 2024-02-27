package com.example.miniproject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="studentDetails")
public class StudentDto {
	@Id
	private int id;
	private String name;
	private String email;
	private String cname;
	@OneToOne
	 private CourseDto courseDto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public CourseDto getCourseDto() {
		return courseDto;
	}
	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}
	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", cname=" + cname + ", courseDto="
				+ courseDto + "]";
	}
	
	
	

}
