package com.csc.driving;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver 
{
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("petrolEngine")
	Engine engine;
	public void driving()
	{
		engine.engineType();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
