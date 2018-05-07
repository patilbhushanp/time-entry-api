package com.sanbhu.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ClicktimeApplication extends SpringBootServletInitializer {

	static {
		System.setProperty("javax.net.ssl.trustStore", "F:\\Bhushan\\Java\\Implementation\\clicktime-api\\time-entry-api\\src\\main\\resources\\application.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "admin");
		System.setProperty("javax.net.ssl.keyStore", "F:\\Bhushan\\Java\\Implementation\\clicktime-api\\time-entry-api\\src\\main\\resources\\application.jks");
		System.setProperty("javax.net.ssl.keyStorePassword", "admin");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ClicktimeApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ClicktimeApplication.class, args);
	}

}