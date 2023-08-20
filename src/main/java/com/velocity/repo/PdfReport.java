package com.velocity.repo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Pdf")
@Primary
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		
		System.out.println("pdf report is geerating");
	}

}
