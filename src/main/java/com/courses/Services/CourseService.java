package com.courses.Services;

import java.util.List;

import com.courses.entities.Courses;

public interface CourseService {

	
	public List<Courses> getCourses();
	
	public Courses getCousesById(long id);
	
	public Courses getAddedCourses(Courses courses);
	
	public Courses updateCourses(Courses courses);
	
	public void courseDelete(long parseLong);
	
	
}