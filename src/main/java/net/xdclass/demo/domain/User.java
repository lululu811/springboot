package net.xdclass.demo.domain;

import java.sql.Date;

public class User {
	
	private String name;
	private String pwd;
	private int age;
	private Date regisTime;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
