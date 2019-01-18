package me.qinchao.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		System.out.println("hello ");

		return "hello";
	}

}

