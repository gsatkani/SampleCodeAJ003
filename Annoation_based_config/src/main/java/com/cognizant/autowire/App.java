package com.cognizant.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.model.Department;

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
       
        
        System.out.println("EEE Details");
        Department eee = context.getBean("eee",Department.class);
        System.out.println(eee.getDeptname());
        System.out.println(eee.getNoOfStudents());
        System.out.println(eee.getCollege().getCollgename());
        System.out.println(eee.getCollege().getCollegecode());
        
        Department it = context.getBean("it",Department.class);
        System.out.println("It Details");
        System.out.println(it.getDeptname());
        System.out.println(it.getNoOfStudents());
        System.out.println(it.getCollege().getCollgename());
        System.out.println(it.getCollege().getCollegecode());
        
    }
}
