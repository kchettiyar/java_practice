package com.kchetty.OppsCon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OppsConApplication {

	public static void main(String[] args) {
		SpringApplication.run(OppsConApplication.class, args);

		A a = new A();
		a.showMsg();
	}

}
