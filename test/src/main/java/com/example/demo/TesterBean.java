package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TesterBean {

	public String val = "testerrrrr";

	public TesterBean() {
		System.out.println("Tester created!");
	}

	public void showMsg() {
		System.out.println("Tester...." + val);
	}
}
