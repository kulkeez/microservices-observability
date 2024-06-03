package com.kulkeez.fraudetect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * Entry program to launch this Spring Boot application. You can launch this application via command line 
 * by typing 'mvn spring-boot:run' from the project directory. 
 * 
 * Various Actuator RESTful end points are added to the application such as /env, /health, /info, 
 * /metrics, /trace and /dump that can be queried as listed below: 
 * 
 * http://localhost:8080/actuator/health
 * http://localhost:8080/actuator/info 
 * http://localhost:8080/actuator/mappings 
 * http://localhost:8080/actuator/env
 * http://localhost:8080/actuator/metrics 
 * 
 * @author <a href="mailto:kulkeez@yahoo.com">Vikram Kulkarni</a> 
 */
// convenience annotation that adds @Configuration, @EnableAutoConfiguration, @ComponentScan
@SpringBootApplication
@Slf4j
public class FraudDetectionServiceApplication {

    public static void main(String[] args) {
        // Launch the application
		log.info("Launching the Fraud Detection microservice application ...");

        SpringApplication.run(FraudDetectionServiceApplication.class, args);
    }

}
