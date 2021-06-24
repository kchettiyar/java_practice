package com.kchetty.customStarter.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kchetty.customStarter.hello.helloService;
import com.kchetty.customStarter.hello.helloServiceImpl;

@Configuration
@ConditionalOnClass(helloService.class)
public class helloServiceAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean
	public helloService _helloService() {
		// System.out.println("this is the IDP Id:- " + __idpId);
		return new helloServiceImpl();
	}
}
