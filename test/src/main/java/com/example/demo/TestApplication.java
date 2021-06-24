package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.kchetty.customStarter.hello.helloService;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestApplication.class, args);

		TestBean t = context.getBean(TestBean.class);
		t.show();
		t.vl = "second";
		t.Tester.showMsg();
		t.Tester.val = "checking";

		TestBean tt = context.getBean(TestBean.class);
		tt.show();
		t.Tester.showMsg();

		t._helloService.sayHello();
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * _helloService.sayHello(); }
	 */

	@Bean
	public helloService _helloService() {
		return new customHelloService();
	}

}
