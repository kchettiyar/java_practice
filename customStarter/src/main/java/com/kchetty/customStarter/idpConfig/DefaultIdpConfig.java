package com.kchetty.customStarter.idpConfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kchetty.customStarter.idpService.IdpDefaultService;
import com.kchetty.customStarter.idpService.IdpInterface;

@Configuration
@ConditionalOnExpression("'${idpName}'=='' || '${idpName}'=='default'")
public class DefaultIdpConfig {

	@Bean
	@ConditionalOnMissingBean
	public IdpInterface _IdpInterface() {
		return new IdpDefaultService();
	}
}
