package com.cj.Prototype;

public class WorkExprience implements Cloneable{

	private String workDate;
	
	private String company;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Object Clone() throws CloneNotSupportedException {
		return this.clone();
	}
}
