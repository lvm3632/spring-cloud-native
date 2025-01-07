package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.config.PolarProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CatalogServiceApplication implements CommandLineRunner {

	@Autowired
	private Environment env;

	@Autowired
	private PolarProperties polar;

	@Value("${server.port}")
	private String serverPort;

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(env.getProperty("server.port"));
		System.out.println(serverPort);
		System.out.println(polar.getGreeting());
	}
}
