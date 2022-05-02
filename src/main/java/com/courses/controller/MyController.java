package com.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.Services.CourseService;
import com.courses.entities.Courses;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	

	// Controller for get all the courses  
	@GetMapping("/courses")
	public List<Courses> getAllCourses(){
		
		return this.courseService.getCourses();
		
	}

	// Controller for get all the courses by ID
	
	@GetMapping("/courses/{id}")
	public Courses getCousesById(@PathVariable String id){
		
		
		return this.courseService.getCousesById(Long.parseLong(id));
		
		
	}
	
	// controller for adding the courses
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		
		return this.courseService.getAddedCourses(courses);
		
	}
	
	// controller for updating the Courses
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses courses  ) {
		
		return this.courseService.updateCourses(courses);
		
	}
	
	//controller for deleting the courses
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> courseDelete(@PathVariable String id) {
		
	try {
		this.courseService.courseDelete(Long.parseLong(id));
		return new ResponseEntity<>(HttpStatus.OK);
		
	}catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	}
	}
	
}
