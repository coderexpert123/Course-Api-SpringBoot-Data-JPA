package com.courses.Services;

 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.courses.dao.CourseDao;
import com.courses.entities.Courses;
@Service
public class CouseServiceImpl implements CourseService{

//	List<Courses> list;
	@Autowired
	private CourseDao courseDao;
	
	public CouseServiceImpl(){
	
//		
//			list=new ArrayList<>();
//			list.add(new Courses(1,"java","Great Programming Java"));
//			list.add(new Courses(2,"Python","Great Programming Python"));
//			list.add(new Courses(3,"Django","Great Programming Django "));
//			list.add(new Courses(44,"Rust","Great Programming Rust"));

	
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll() ;
	}

	
	//function for get course by id
	@Override
	public Courses getCousesById(long id) {
//		// TODO Auto-generated method stub
//		Courses c=null;
//		
//		for(Courses courses:list) {
//			
//			if(courses.getId()==id) {
//				
//				c=courses;
//				break;
//				
//			}
//		}
 	return courseDao.getOne(id);
	}

	@Override
	public Courses getAddedCourses(Courses courses) {
		//list.add(courses);
		courseDao.save(courses);
		
		return courses;
	}

	@Override
	public Courses updateCourses(Courses courses) {
		// TODO Auto-generated method stub
		
//		list.forEach(e->{
//			
//			if (e.getId()==courses.getId()) {
//				
//				e.setTittle(courses.getTittle());
//				e.setDescription(courses.getDescription());
//				
//				
//			}
//			
//		});
		courseDao.save(courses);
		
		
		return courses;
	}

	@Override
	public void courseDelete(long parseLong) {
//		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parseLong)
//				.collect(Collectors.toList());
//		
Courses entitys=courseDao.getOne(parseLong);
courseDao.delete(entitys);
	}

	
	 
}
