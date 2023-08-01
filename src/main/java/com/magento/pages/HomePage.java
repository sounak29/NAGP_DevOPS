package com.magento.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {

	 Logger log = LogManager.getLogger(HomePage.class);

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Women']")
	public WebElement Women;


	//Action
	public void clickOnWomen()
	{		
	
		log.info("click on Women Button");

		Women.click();
	}

}
