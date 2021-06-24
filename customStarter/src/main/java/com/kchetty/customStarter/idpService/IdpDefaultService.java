package com.kchetty.customStarter.idpService;

public class IdpDefaultService implements IdpInterface {
	private String __defaultKey = "default";

	@Override
	public void showIdpKey() {
		System.out.println("This is default key:- " + this.__defaultKey);
	}
}
