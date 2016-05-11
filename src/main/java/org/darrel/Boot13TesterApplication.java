package org.darrel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Boot13TesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot13TesterApplication.class, args);
	}
}
