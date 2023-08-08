package com.magento.extentreport;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExtentReporterNG {
	static Logger log = LogManager.getLogger(ExtentReporterNG.class);

	public static ExtentReports extent;
	public static ExtentReports extentReportergenerator()
	{
		log.info("Setting Extent Report Info.........");

		
		String path="./Current test results/Extetent Report.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Report - Magento Software Testing Board ");
		reporter.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Sounak Roy");
		return extent;
		
	}
}
