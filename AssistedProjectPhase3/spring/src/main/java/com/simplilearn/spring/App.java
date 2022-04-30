package com.simplilearn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.simplilearn.spring.controllers.EmployeeController;
import com.simplilearn.spring.entity.Employee;

/**
 * Hello world!
 *
 */
@ComponentScan("com.simplilearn.spring.*")
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		Employee employee = context.getBean(Employee.class); 
//		System.out.println(employee);
//		
//		Employee employee2 = context.getBean("emp",Employee.class);
//		System.out.println(employee2);
		EmployeeController controller = context.getBean(EmployeeController.class);
		System.out.println(controller.getController());
	}
}
