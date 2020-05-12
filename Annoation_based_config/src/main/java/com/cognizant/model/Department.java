package com.cognizant.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Department {

	String deptname;
	int noOfStudents;
	// Has A  RelationShip -> College Has-A Department
	@Autowired  // default mode byType
	@Qualifier("college2")  // mode byName
	College college;

	public String getDeptname() {
		return deptname;
	}
    
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Department [deptname=" + deptname + ", noOfStudents=" + noOfStudents + ", college=" + college + "]";
	}
	
	

}
