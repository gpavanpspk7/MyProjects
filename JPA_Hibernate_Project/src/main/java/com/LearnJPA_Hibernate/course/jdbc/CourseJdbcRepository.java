package com.LearnJPA_Hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.LearnJPA_Hibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate template;
	
	private static String insertQuery=
			"""
			insert into course(id,name,author)
			values(?,?,?);
			""";
	
	private static String deleteQuery=
			"""
			delete from course where id=?
			
			""";
	private static String findwithId=
			"""
				select * from course where id =? 
			""";
	 
	public void insert(Course course) {
		template.update(insertQuery,course.getId(),course.getName(),course.getAuthor());
	}
	
	public void delete(int id ) {
		template.update(deleteQuery,id);
	}
	
	public Course findById(int id) {
		return template.queryForObject(findwithId,new BeanPropertyRowMapper<>(Course.class),id);
	}
}
