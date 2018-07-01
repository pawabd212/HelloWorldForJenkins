package com.example.demo.dto;

public class Header {

	private int apppId;
	private float version;

	public int getApppId() {
		return apppId;
	}

	public void setApppId(int apppId) {
		this.apppId = apppId;
	}

	public float getVersion() {
		return version;
	}

	public void setVersion(float version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Header [apppId=" + apppId + ", version=" + version + "]";
	}

}
