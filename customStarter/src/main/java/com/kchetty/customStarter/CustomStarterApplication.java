package com.kchetty.customStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// @EnableConfigurationProperties(TestProp.class)
// @ConfigurationPropertiesScan("com.kchetty.customStarter.configurationproperties")
public class CustomStarterApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomStarterApplication.class, args);
		TestingClass t = context.getBean(TestingClass.class);
		t.showVal();
		
		System.out.print("idp valsfsdsd:-lsdfnlskdn");
		t.__TestProp.test();

	}
}
