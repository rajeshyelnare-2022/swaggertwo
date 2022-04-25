package com.two.swaggertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.*;
import springfox.documentation.service.Contact;


@SpringBootApplication
public class SwaggertwoApplication {
//http://localhost:8080/swagger-ui/index.html
	public static void main(String[] args) {
		SpringApplication.run(SwaggertwoApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.two.swaggertwo"))
				.build()
				.apiInfo(apiDetails());
						
	}
	private ApiInfo apiDetails() {
		return new  ApiInfo(
				"Student API",
				"Sample API for Student Data",
				"0.1",
				"Test purpose only",
				new Contact("Rajesh Yelnare", "yelnare.com", "rajesh@yelnare.com"), 
				"API License",
				"yelnare.com",
				Collections.emptyList());
				
				
	}

}
