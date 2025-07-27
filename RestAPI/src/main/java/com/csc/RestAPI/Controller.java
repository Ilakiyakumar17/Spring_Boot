package com.csc.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	//Handling request parameter
	@GetMapping("/hello")
public String Welcome(@RequestParam(value="name",defaultValue="JavaWorld")String name)

{
	return "Hello"+name;
}
	//Handling the path variables
	@GetMapping("/greet/{name}")
	public String Greet(@PathVariable String name)
	{
return "Greetings "+name;
}
}
