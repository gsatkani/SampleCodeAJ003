package com.cognizant.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.config.AppConfig;
import com.cognizant.model.College;
import com.cognizant.model.Department;

/**
 * Hello world!
 *
 */
public class App {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);

		College college = (College) context.getBean("college");
		Department eee = context.getBean("eee", Department.class);
		college.setCollgename("ABC eng coll");
		college.setCollegecode("1120");

		//System.out.println(college.getCollegecode());
		//System.out.println(college.getCollgename());
		
		eee.setDeptname("EEE");
		eee.setNoOfStudents(123);
		
		System.out.println(eee.getDeptname());
		System.out.println(eee.getNoOfStudents());
		System.out.println(eee.getCollege().getCollgename());
		System.out.println(eee.getCollege().getCollegecode());

	}
}
