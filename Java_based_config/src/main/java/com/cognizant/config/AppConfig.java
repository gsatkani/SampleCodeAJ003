package com.cognizant.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cognizant.model.College;
import com.cognizant.model.Department;

@Configuration
@ComponentScan("com.cognizant.model")
public class AppConfig {
	
	// Bean Definition
	@Bean(name = "college")
	//@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Scope("singleton")
	//@Scope(scopeName = "")
	public College getCollege() {
		return new College();
	}
	
	// Bean Definition
	@Bean(name = "eee")
	public Department getEee() {
		return new Department();
	}

}
