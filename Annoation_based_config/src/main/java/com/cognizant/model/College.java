package com.cognizant.model;

public class College {
	
	String collgename;
	String collegecode;

	public String getCollgename() {
		return collgename;
	}

	public void setCollgename(String collgename) {
		this.collgename = collgename;
	}

	public String getCollegecode() {
		return collegecode;
	}

	public void setCollegecode(String collegecode) {
		this.collegecode = collegecode;
	}

	@Override
	public String toString() {
		return "College [collgename=" + collgename + ", collegecode=" + collegecode + "]";
	}


}
