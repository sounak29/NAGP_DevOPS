package com.magento.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.magento.extentreport.ScreenShot;

public class BaseTest {
	
	public static final ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	 static Logger log = LogManager.getLogger(BaseTest.class);
	
	static File congigFile =new File("./Resource/config.properties");
	static FileInputStream configFis=null;
	static Properties configProp =new Properties();
	
	static File validateDataFile =new File("./Resource/validation.properties");
	static FileInputStream validateFis=null;
	static Properties validateProp =new Properties();
	
	static File testDataFile =new File("./Resource/testdata.properties");
	static FileInputStream testDataFis=null;
	static Properties testDataProp =new Properties();

	static 
	{

		try {
			configFis = new FileInputStream(congigFile);
			validateFis=new FileInputStream(validateDataFile);
			testDataFis=new FileInputStream(testDataFile);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			configProp.load(configFis);
			validateProp.load(validateFis);
			testDataProp.load(testDataFis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeMethod(alwaysRun=true)
	public static void inializeDriver()
	{
		log.info("Initialize the Driver..........");
		String browserName=configProp.getProperty("browsername");
		if(browserName.equals("chrome")) {
			
			driver.set(new ChromeDriver());	
		}
		else if(browserName.equals("firefox")) {
			
			driver.set(new FirefoxDriver());					
		}
		else if(browserName.equals("edge")) {
			
			driver.set(new EdgeDriver());;					
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
	
	}
	
	@BeforeMethod(alwaysRun=true)
	public static void openUrl()
	{
		log.info("Opening the URL..........");

		getDriver().get(configProp.getProperty("url"));
	}
		
	@AfterMethod(alwaysRun=true)
	public static void close()
	{
		log.info("Closing the Driver..........");

		getDriver().quit();
		driver.remove();
	}

	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
}
