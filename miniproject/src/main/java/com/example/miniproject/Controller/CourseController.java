package com.example.miniproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.miniproject.dto.CourseDto;
import com.example.miniproject.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/chtml")
	public String courseHtml() {
		return "course.html";
	}
	@PostMapping("/ci")
	@ResponseBody
	public String insertCourse(@ModelAttribute CourseDto courseDto )
	{
		System.out.println(courseDto);
		return courseService.insertCourse(courseDto);
	}

}
