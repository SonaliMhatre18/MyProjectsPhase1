package com.simplilearn.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class WiringConfiguration {
	
	@Bean(initMethod = "init", destroyMethod = "destroyed")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PlainSimpleLogic plainSimpleLogic(SimpleLogic simpleLogic) {
		return new PlainSimpleLogic(simpleLogic);
	}

}
