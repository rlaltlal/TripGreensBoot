package com.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


	@RequestMapping("test")
	@ResponseBody
	public String test() {
		return "<h1>hello Test</h1>";		
	}
}
