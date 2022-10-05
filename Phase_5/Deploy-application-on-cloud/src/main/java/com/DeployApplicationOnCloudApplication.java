package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class DeployApplicationOnCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployApplicationOnCloudApplication.class, args);
	}

}
