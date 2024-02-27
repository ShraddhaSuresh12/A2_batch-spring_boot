package com.example.miniproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miniproject.dao.CourseDao;
import com.example.miniproject.dto.CourseDto;
@Service
public class CourseService {
@Autowired
CourseDao courseDao;

public String insertCourse(CourseDto courseDto)
{
	return courseDao.insertCourse(courseDto);
}

public CourseDto fetchCourse(String cname)
{
	return courseDao.fetchCourse(cname);
}
}
