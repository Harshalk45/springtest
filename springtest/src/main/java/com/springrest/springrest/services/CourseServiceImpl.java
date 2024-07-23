package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService
  {
       private static final Long CourseId = null;
	@Autowired
	private CourseDao courseDao;
	//List<Course> list;
	
	public CourseServiceImpl() {
		
//		list= new ArrayList<>();
//		list.add(new Course(145,"java core Course","this course contain basics of java"));
//		list.add(new Course(4343,"Spring boot Course","creating rest api using spring boots"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll()
;	}

	@Override
	public Course getcourse(long courseId) 
	{
//		// TODO Auto-generated method stub
//		Course c=null;
//		for(Course Course:list)
//		{
//			if(Course.getId()==courseId)
//			{
//				c=Course;
//				break;
//			}
//		}
		return courseDao.getOne(CourseId);
	}

	@Override
	public Course addCourse(Course course)
	{
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e ->
//		{
//			if(e.getId()== course.getId())
//			{
//			   e.setTitle(course.getId());
//			   e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parcelLong) {
//		// TODO Auto-generated method stub
//		list=this.list.stream().filter(e->e.getId()!=parselLong(Collector.toList());
		Course en = courseDao.getOne(CourseId);
		courseDao.delete(en);
	}

}
