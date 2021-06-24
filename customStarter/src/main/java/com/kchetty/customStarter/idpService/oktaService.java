package com.kchetty.customStarter.idpService;

public class oktaService implements IdpInterface {
	private String __oktaKey;

	public oktaService() {
	}

	public oktaService(String key) {
		this.__oktaKey = key;
	}

	@Override
	public void showIdpKey() {
		System.out.println("This is keycloak key:- " + this.__oktaKey);
	}
}
