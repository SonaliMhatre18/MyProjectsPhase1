package com.simplilearn.jpatohibernate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simplilearn.jpatohibernate.Repository.CourseRepository;
import com.simplilearn.jpatohibernate.entity.Course;

@SpringBootApplication
public class JpatohibernateApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpatohibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 	Course course = repository.findById(10001L);
	 	logger.info("Course 10001 ->{}",course);
		
	}

}
