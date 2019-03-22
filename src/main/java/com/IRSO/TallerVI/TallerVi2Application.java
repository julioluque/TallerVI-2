package com.IRSO.TallerVI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.Irso.TallerVI")
public class TallerVi2Application {

	public static void main(String[] args) {
		SpringApplication.run(TallerVi2Application.class, args);
	}
}
