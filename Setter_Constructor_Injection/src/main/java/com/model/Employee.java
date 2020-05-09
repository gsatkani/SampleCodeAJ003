package com.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee {

	public int id;
	public String name;
	public ArrayList<Integer> list;
	public HashMap<Integer,String> map;
	
	public Employee() {
		super();
		System.out.println("Employee Constructor");
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, ArrayList<Integer> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	
	
     
	
	
	
//	public HashMap<Integer, String> getMap() {
//		return map;
//	}
//
//	public void setMap(HashMap<Integer, String> map) {
//		this.map = map;
//	}
//
//	public ArrayList<Integer> getList() {
//		return list;
//	}
//
//	public void setList(ArrayList<Integer> list) {
//		this.list = list;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

}
