package com.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
