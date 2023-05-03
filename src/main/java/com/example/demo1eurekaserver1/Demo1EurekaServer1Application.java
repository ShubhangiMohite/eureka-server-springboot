package com.example.demo1eurekaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Demo1EurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1EurekaServer1Application.class, args);
	}

}
