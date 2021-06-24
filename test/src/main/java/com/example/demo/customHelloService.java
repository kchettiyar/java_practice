package com.example.demo;

import com.kchetty.customStarter.hello.helloService;

public class customHelloService implements helloService {

	@Override
	public void sayHello() {
		System.out.println("My own hello service is implemented!!! hahhaha");
	}

}
