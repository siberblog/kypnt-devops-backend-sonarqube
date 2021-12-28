package com.kypnt.devopsbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KypntDevopsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KypntDevopsBackendApplication.class, args);
	}

	public static void main(String[] args) {
	System.out.println(new App3().getMessage());
	}

	private final String getMessage() {
	return message;
	}
}


