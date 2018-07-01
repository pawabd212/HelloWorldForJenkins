package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HelloRequest;
import com.example.demo.dto.HelloResponse;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public HelloResponse sayHello(@RequestBody HelloRequest request) {
		HelloResponse response = new HelloResponse();

		response.setHeader(request.getHeader());
		response.setMsg("Message is: " + request.getMessage());

		return response;
	}
}
