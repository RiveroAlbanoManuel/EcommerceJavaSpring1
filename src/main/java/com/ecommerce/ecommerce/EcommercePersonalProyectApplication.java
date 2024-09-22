package com.ecommerce.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class EcommercePersonalProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommercePersonalProyectApplication.class, args);
	}

}
