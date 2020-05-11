package com.cognizant.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        context = new ClassPathXmlApplicationContext("spring.xml");
        Department cse = context.getBean("cse",Department.class);
        System.out.println("CSE Details");
        System.out.println(cse.getDeptname());
        System.out.println(cse.getNoOfStudents());
        System.out.println(cse.getCollege().getCollgename());
        System.out.println(cse.getCollege().getCollegecode());
        
        System.out.println("EEE Details");
        Department eee = context.getBean("eee",Department.class);
        System.out.println(eee.getDeptname());
        System.out.println(eee.getNoOfStudents());
        System.out.println(eee.getCollege().getCollgename());
        System.out.println(eee.getCollege().getCollegecode());
        
    }
}
