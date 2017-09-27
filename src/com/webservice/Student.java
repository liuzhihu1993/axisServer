package com.webservice;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAge() {
		return stuAge;
	}

	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	private String stuName;

	private String stuAge;

	private int stuId;
}
