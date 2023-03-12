package com.calculator.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator 
{
	@RequestMapping("/add")
	public String Addition(@RequestParam(name="num1",required=true, defaultValue="15") int num1,
							@RequestParam(name="num2",required=true, defaultValue="10") int num2)
	{
		int res=num1+num2;
		return "<body bgcolor='orange' text='black'>" +
				"<centre><h1>Addition = "+res+" </h1></centre>" +
				"</body";
	}

	
	@RequestMapping("/sub")
	public String Substraction(@RequestParam(name="num1",required=true, defaultValue="15") int num1,
							@RequestParam(name="num2",required=true, defaultValue="10") int num2)
	{
		int res=num1-num2;
		return "<body bgcolor='orange' text='black'>" +
				"<centre><h1>Substraction = "+res+" </h1></centre>" +
				"</body";
	}
	
	@RequestMapping("/mul")
	public String Multiplition(@RequestParam(name="num1",required=true, defaultValue="15") int num1,
							@RequestParam(name="num2",required=true, defaultValue="10") int num2)
	{
		int res=num1*num2;
		return "<body bgcolor='orange' text='black'>" +
				"<centre><h1>Multiplication = "+res+" </h1></centre>" +
				"</body";
	}


	@RequestMapping("/div")
	public String Division(@RequestParam(name="num1",required=true, defaultValue="15") int num1,
							@RequestParam(name="num2",required=true, defaultValue="5") int num2)
	{
		int res=num1/num2;
		return "<body bgcolor='orange' text='black'>" +
				"<centre><h1>Division = "+res+" </h1></centre>" +
				"</body";
	}

}
