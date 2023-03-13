package com.tpe;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.NamingConventions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration()
				.setFieldMatchingEnabled(true) // !!! filed lari eslestir
				.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE) // !!! access level private olsun
				.setSourceNamingConvention(NamingConventions.JAVABEANS_MUTATOR);
		return modelMapper;
	}

	// !!! LogServisin Clienti olabilsin diye eklendi
	@Bean
	// !!! RestTemplate Client olusturmamizin yollarindan biri
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
