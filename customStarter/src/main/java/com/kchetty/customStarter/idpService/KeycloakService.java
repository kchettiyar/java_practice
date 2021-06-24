package com.kchetty.customStarter.idpService;

public class KeycloakService implements IdpInterface {

	private String __keycloakKey;
	
	public KeycloakService() {}
	public KeycloakService(String key) {
		this.__keycloakKey = key;
	}
	
	@Override
	public void showIdpKey() {
		System.out.println("This is keycloak key:- " + this.__keycloakKey);
	}

}
