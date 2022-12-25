package com.jpa.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a = 16;
		int b = 34;
		int c = 90;
		return "this is just for testing \t sum of a+b+c is " + (a + b + c);
	}
}
