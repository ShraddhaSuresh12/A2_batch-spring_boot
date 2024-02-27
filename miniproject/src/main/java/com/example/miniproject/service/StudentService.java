package com.example.miniproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miniproject.dao.StudentDao;
import com.example.miniproject.dto.StudentDto;


@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;

	public String insertStudent(StudentDto studentDto) {
		return studentDao.insertStudent(studentDto);
	}
	
	public StudentDto fetchStudentById(int id)
	{
	 Optional<StudentDto> od=studentDao.fetchStudentById(id);
	 if(od.isPresent())
	 {
		 return od.get();
	 }
	 else {
		 return null;
	 }
	}
	
	public List<StudentDto> fetchAllStudent(){
		List<StudentDto> list=studentDao.fetchAllStudent();
	if(list.isEmpty())
	{
		return null;
	}
	else {
		return list;
	}
	}
	

}
