package com.simplilearn.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlainSimpleLogic implements InitializingBean {
	
	@Autowired
	private SimpleLogic simpleLogic;
	
	public PlainSimpleLogic(SimpleLogic simpleLogic) {
		System.out.println("Class was created");
		this.simpleLogic = simpleLogic;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Class was initialized");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Class was initialized in afterPropertiesSet");
		
	}
	
	@PreDestroy
	public void destroyed() {
		System.out.println("Bean is about to destroyed");
	}
	
	public void doSomeWork() {
		simpleLogic.doSimpleWork();
	}
	
}
