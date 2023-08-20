package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.velocity.service.ReportService;

@SpringBootApplication
public class Octssb12Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Octssb12Application.class, args);
         ReportService bean = context.getBean(ReportService.class);
         bean.dowloadReport();
	}

}
