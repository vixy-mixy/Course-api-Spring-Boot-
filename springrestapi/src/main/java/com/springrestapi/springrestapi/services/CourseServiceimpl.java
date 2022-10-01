package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(145,"Java course","This is full fleged java course"));
		list.add(new Course(146,"Python course","This is full fleged python course"));
		list.add(new Course(147,"Design and Analysis of Algorithm","Course on Algorithm analysis"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}
	
	

}
