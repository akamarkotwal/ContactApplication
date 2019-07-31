package com.akcap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/test/hellow")
	public String helloWord() {
		return "hellow";
		
	}

}
