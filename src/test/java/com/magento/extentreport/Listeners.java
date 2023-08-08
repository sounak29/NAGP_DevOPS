package com.magento.extentreport;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.magento.test.BaseTest;
import com.magento.utill.DeleteDirectory;
import com.magento.utill.FileMove;
import com.magento.utill.FileRead;
import com.magento.utill.FileWrite;


public class Listeners extends BaseTest implements ITestListener {
	
	ExtentReports extent=ExtentReporterNG.extentReportergenerator();
	ExtentTest test;
	private static ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	
	public  String date;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getDescription());
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().log(Status.PASS, "Test Case PASSED Successfully");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		extentTest.get().fail(result.getThrowable());
		extentTest.get().addScreenCaptureFromPath(ScreenShot.takeScreenshot(getDriver(), result.getMethod().getMethodName()), result.getMethod().getMethodName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		date=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(Calendar.getInstance().getTime());
		File file=new File("Current test results");
		File rename=new File("Current test results"+date);
		file.renameTo(rename);
		FileWrite.writeFile(date, "./Resource/value.txt");
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String name = null;
		try {
			name = FileRead.readFile("./Resource/value.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String archiveFilePath = "./Archived test results";
		String currentFileReportPath="./Current test results"+name;
		String currentScreenshotPath="./FaildedScreenshot";
		String archiveFilePathScreeshot = "./Archived test results/FaildedScreenshot";

	
		File souurecFile=new File(currentFileReportPath);
		File souurecScreenshot=new File(currentScreenshotPath);
		File archiveFile=new File(archiveFilePath);
		
		if(archiveFile.exists())
		{
			DeleteDirectory.deleteDirectory(archiveFile);
		}
		
		if(souurecScreenshot.exists()) 
		{
			FileMove.moveFile(currentScreenshotPath, archiveFilePathScreeshot);
		}
	
		if(souurecFile.exists())
		{

			FileMove.moveFile(currentFileReportPath, archiveFilePath);
		}

		
		File oldFile=new File("./Current test results"+name);
		File oldScreenshot=new File("./FaildedScreenshot");
		if(oldFile.exists())
		{
			DeleteDirectory.deleteDirectory(oldFile);
			oldFile.delete();
		}
		if(oldScreenshot.exists())
		{
			DeleteDirectory.deleteDirectory(oldScreenshot);
			oldScreenshot.delete();
		}
	}
	
}
