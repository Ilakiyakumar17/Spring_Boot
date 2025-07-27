package com.csc.ptu_college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EIStudent
{
	private int sid;
	private String sname;
	private String city;
	
	public EIStudent()
	{
		System.out.println("EIStudent object is created");
	}
	@Autowired
	ITStudent itstudent;
	public void show()
	{
		itstudent.show();
		System.out.println("EIStudent class has been called...!!!");
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
	

}


