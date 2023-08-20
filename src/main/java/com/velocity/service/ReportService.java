package com.velocity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.velocity.repo.IReport;

@Service
public class ReportService {
	
	private IReport report;
	@Autowired
	public ReportService(@Qualifier("excel") IReport report) {
		this.report = report;
		System.out.println("Injected Bean ::"+report.getClass().getName());
	}
	public void dowloadReport() {
		report.generateReport();
		
	
		
	}

}
