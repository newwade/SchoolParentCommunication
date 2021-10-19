package com.cg.spc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages={"com.cg.spc","com.cg.spc.service"})
@EntityScan(basePackages = {"com.cg.spc.entities"})  // scan JPA entities
public class SchoolParentCommunicationApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(SchoolParentCommunicationApp1Application.class, args);
		System.out.println("listening on the port 8081...");
	}

}
