package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class Assignment1ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1ApiGatewayApplication.class, args);
	}

	/*@Bean
    RouteLocator configRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("assignment1", r -> r.path("/backend/**").uri("lb://BACKEND")) //static 
				.route("assignment1-frontend", r -> r.path("/frontend/**").uri("lb://FRONTEND")) //dynamic
					.build();
	}*/
}

