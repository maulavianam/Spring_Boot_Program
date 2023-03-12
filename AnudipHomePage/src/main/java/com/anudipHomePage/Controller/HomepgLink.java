package com.anudipHomePage.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
public class HomepgLink 
{
	//http://localhost:1001/Hplink
	
	//RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 
	@RequestMapping("/Hplink")
	public String Hplink()
	{
		return "<body bgcolor='Orange', text='Black'><center><h1> Anudip Foundation </h1></center>\"\r\n"
				+"<center><h2> Home Page Link </h2></center>\"\r\n"
				+"<center><h3><a href=https:aln.anudip.org style='color:green'>https:aln.anudip.org</a></h3></center></body>";
	}

}
