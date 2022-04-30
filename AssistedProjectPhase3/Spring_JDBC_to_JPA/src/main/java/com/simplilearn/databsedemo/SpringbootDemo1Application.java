package com.simplilearn.databsedemo;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simplilearn.databsedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringbootDemo1Application implements CommandLineRunner {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJdbcDao dao;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 logger.info("All users -> {}",dao.findAll());
	 logger.info("User id 10001 -> {}",dao.findById(10001));
		
	}

}
