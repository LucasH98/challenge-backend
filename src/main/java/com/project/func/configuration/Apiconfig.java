package com.project.func.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Apiconfig {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
