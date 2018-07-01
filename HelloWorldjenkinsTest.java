package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.demo.controller.HelloController;
import com.example.demo.dto.Header;
import com.example.demo.dto.HelloRequest;

public class HelloWorldjenkinsTest {

	@Test
	public void testValidity() {
		HelloRequest request = new HelloRequest();
		Header header = new Header();

		header.setApppId(123456);
		header.setVersion(1.0f);
		request.setMessage("This is test");
		request.setHeader(header);

		HelloController controller = new HelloController();
		assertEquals("Message is: This is test", controller.sayHello(request).getMsg());
	}
}
