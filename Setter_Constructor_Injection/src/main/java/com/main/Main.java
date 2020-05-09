package com.main;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee2 = context.getBean("employee2", Employee.class);
		System.out.println(employee2.id);
		System.out.println(employee2.name);
		System.out.println(employee2.list);

		Employee employee3 = context.getBean("employee3", Employee.class);
		System.out.println(employee3.id);
		System.out.println(employee3.name);

		
//		System.out.println("Employeee 1 Details");
//		System.out.println(employee.getId());
//		employee.setName("AAAAAAA");
//		System.out.println(employee.getName());
//		ArrayList<Integer> list = employee.getList();
//		System.out.println(list);
//		HashMap<Integer, String> hashMap = employee.getMap();
//		System.out.println(hashMap);

//		Employee employee1 = context.getBean("employee1", Employee.class);
//		System.out.println("Employee 2 Details");
//		System.out.println(employee1.getId());
//		System.out.println(employee1.getName());

	}

}
