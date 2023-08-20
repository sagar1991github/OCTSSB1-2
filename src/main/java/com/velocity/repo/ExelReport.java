package com.velocity.repo;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExelReport implements IReport  {

	@Override
	public void generateReport() {
		System.out.println("Exel Report is generating");
	}

}
