package com.kchetty.customStarter.hello;

public class helloServiceImpl implements helloService {

	@Override
	public void sayHello() {
		System.out.print("Hello from the default starter hello service");
	}
}
