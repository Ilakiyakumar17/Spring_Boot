package com.csc.springboot_sample;

import org.springframework.stereotype.Component;

@Component
public class Groscery implements Ordering{

	public void order()
	{
		System.out.println("Ordering groscery products...");
		
	}

}
