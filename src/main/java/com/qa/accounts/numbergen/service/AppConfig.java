package com.qa.accounts.numbergen.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public GenInterface accountNumberGenerator() {
		return new NumberGenerator6();
	}

}
