package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.miniproject.dto.CourseDto;
@Repository
public interface CourseRepository extends JpaRepository<CourseDto, String>{

}
