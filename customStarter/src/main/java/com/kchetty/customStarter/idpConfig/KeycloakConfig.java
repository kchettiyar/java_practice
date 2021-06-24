package com.kchetty.customStarter.idpConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kchetty.customStarter.idpService.IdpInterface;
import com.kchetty.customStarter.idpService.KeycloakService;

@Configuration
// @ConditionalOnProperty(name = "idpId", havingValue = "1")
@ConditionalOnExpression("'${idpId}'=='1' && '${idpName}'=='keycloak'")
public class KeycloakConfig {

	@Value("${keycloakKey}")
	private String __keycloakKey;

	@Bean
	public IdpInterface _IdpInterface() {
		return new KeycloakService(__keycloakKey);
	}

}
