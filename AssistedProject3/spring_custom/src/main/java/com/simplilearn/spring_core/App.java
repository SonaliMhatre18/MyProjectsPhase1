package com.simplilearn.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1);
		System.out.println(e1.getId() + " " + e1.getEname());

		DAO dao = context.getBean("dao_ref", DAO.class);
		System.out.println(dao);
		dao.getDAO();

		ServiceDemo service = context.getBean("service", ServiceDemo.class);
		System.out.println(service);
		System.out.println(service.getDao());
		
		Employee e2 = context.getBean("emp2",Employee.class);
		System.out.println(e2);
		System.out.println(e2.getId() + " " + e2.getEname());
		
		Address a1 = context.getBean("address_ref",Address.class);
		a1.getCities();
		
		Employee e3 = context.getBean("employee3",Employee.class);
		System.out.println(e3);
		System.out.println(e3.getId() + " " + e3.getEname());
		System.out.println(e3.getAddress());
		System.out.println(e3.getAddress().getCities());
	}
}
