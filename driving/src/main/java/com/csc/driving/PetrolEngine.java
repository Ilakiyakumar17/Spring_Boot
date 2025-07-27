package com.csc.driving;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine 
{
	public void engineType()
	{
		System.out.println("your are going to drive petrol engine ...");
	}

}
