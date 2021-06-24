package com.kchetty.customStarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kchetty.customStarter.configProp.TestProp;
import com.kchetty.customStarter.idpService.IdpInterface;

@Service
public class TestingClass {
	@Autowired
	IdpInterface __IdpInterface;
	
	@Autowired
	TestProp __TestProp;

	public void showVal() {
		__IdpInterface.showIdpKey();
	}
}
