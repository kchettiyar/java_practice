package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.kchetty.customStarter.hello.helloService;

@Component
@Scope(value="prototype")
public class TestBean {
	public String vl ="initial";
	
	@Autowired
	public TesterBean Tester;
	
	@Autowired
	helloService _helloService;
	
	
	public TestBean() {
		System.out.println("object created");
	}
	
	public void show() {
		System.out.println("show case " + vl);
	}
}
