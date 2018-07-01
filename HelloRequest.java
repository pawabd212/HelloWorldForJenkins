package com.example.demo.dto;

public class HelloRequest {

	private Header header;
	private String message;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloRequest [header=" + header + ", message=" + message + "]";
	}

}
