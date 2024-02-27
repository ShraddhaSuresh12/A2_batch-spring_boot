package com.example.miniproject.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.miniproject.dto.CourseDto;
import com.example.miniproject.repository.CourseRepository;

@Component
public class CourseDao {
	@Autowired
	CourseRepository courseRepository;
	
	public String insertCourse(CourseDto courseDto )
	{
		courseRepository.save(courseDto);
		return "inserted";
	}
	
	
	public CourseDto fetchCourse(String cname) {
		Optional<CourseDto> co=courseRepository.findById(cname);
		return co.get();
	}

}
