package com.LearnJPA_Hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.LearnJPA_Hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	@Autowired
	public CourseJdbcRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.insert(new Course(1,"java","pk"));
		repo.insert(new Course(2,"aws","k"));
		repo.insert(new Course(3,"adf","gk"));
		
		//repo.delete(2);
		System.out.println(repo.findById(1));
	}

}
