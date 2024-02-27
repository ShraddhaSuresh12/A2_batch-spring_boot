package com.example.miniproject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.miniproject.dto.StudentDto;
import com.example.miniproject.repository.StudentRepository;

@Component
public class StudentDao {
	@Autowired
	StudentRepository studentRepository;
	
	public String insertStudent(StudentDto studentDto ) {
		studentRepository.save(studentDto);
		return "data inserted";
	}
	
	public Optional<StudentDto> fetchStudentById(int id){
		return studentRepository.findById(id);
	}
	public  List<StudentDto> fetchAllStudent() {
		List<StudentDto> list=studentRepository.findAll();
		return list;
	}

}
