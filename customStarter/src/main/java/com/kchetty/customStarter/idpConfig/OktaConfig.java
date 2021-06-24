package com.kchetty.customStarter.idpConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kchetty.customStarter.idpService.IdpInterface;
import com.kchetty.customStarter.idpService.oktaService;

@Configuration
// @ConditionalOnProperty(name = "idpId", havingValue = "2")
@ConditionalOnExpression("'${idpId}'=='2' && '${idpName}'=='okta'")
public class OktaConfig {

	@Value("${oktaKey}")
	private String __oktaKey;

	@Bean
	public IdpInterface _IdpInterface() {
		return new oktaService(__oktaKey);
	}

}
