package com.springrestapi.springrestapi.services;
import java.util.*;

import com.springrestapi.springrestapi.entities.Course;
public interface CourseService {
	
	public List<Course>getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Course course,long courseId);
}
