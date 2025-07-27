package com.csc.ptu_college;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Lazy
public class ITStudent 
{
	private int sid;
	private String sname;
	private String city;
	
	public ITStudent()
	{
		System.out.println("ITStudent object is created");
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "ITStudent [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
	
	public void show()
	{
		System.out.println("ITStudent class has been called...!!!");
	}

}
