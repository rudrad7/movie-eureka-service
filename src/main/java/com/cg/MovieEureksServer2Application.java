package com.cg;
/*
 * Top Recommendation From Debugging Guide:
Give these settings a try individually in application.properties 
of all microservices (currency-exchange, currency-conversion)
 to see if they help
eureka.instance.prefer-ip-address=true
OR
eureka.instance.hostname=localhost
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieEureksServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(MovieEureksServer2Application.class, args);
		System.out.println("Movie Eureka server strted on 8761");
	}

}
