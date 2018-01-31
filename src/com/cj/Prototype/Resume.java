package com.cj.Prototype;

public class Resume implements Cloneable {

	private String name;
	private String sex;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
//	private String timeArea;
//	private String company;
//	public String getTimeArea() {
//		return timeArea;
//	}
//
//	public void setTimeArea(String timeArea) {
//		this.timeArea = timeArea;
//	}
//
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}
//	public void setWorkExprience(String timeArea, String company) {
//		this.timeArea = timeArea;
//		this.company = company;
//	}
//	public void display() {
//		System.out.println(name + "," + sex + "," + age + "岁");
//		System.out.println("工作经历" + timeArea + company);
//	}
	
	public void setPersonalInfo(String sex, String age) {
		this.sex = sex;
		this.age = age;
	}

	private WorkExprience work;
	
	public Resume(String name) {
		super();
		this.name = name;
		work = new WorkExprience();
	}

	
	
	public void setWorkExprience(String workDate, String company) {
		work.setWorkDate(workDate);
		work.setCompany(company);
	}

	
	public void display() {
		System.out.println(name + "," + sex + "," + age + "岁");
		System.out.println("工作经历" + work.getWorkDate() + work.getCompany());
	}
	
//	public Object Clone() throws CloneNotSupportedException {
//		return this.clone();
//	}

	public Resume(WorkExprience work) throws CloneNotSupportedException {
		super();
		this.work = (WorkExprience) work.Clone();
	}
	
	// 3
	
	public Object Clone() throws CloneNotSupportedException{
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
}
