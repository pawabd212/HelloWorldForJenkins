package com.example.demo.dto;

public class HelloResponse {

	private Header header;
	private String msg;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloResponse [header=" + header + ", msg=" + msg + "]";
	}

}
