package com.microservicio.jfpl.configserverprodbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerProdbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerProdbookingApplication.class, args);
	}

}
