package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SalePage {
	 Logger log = LogManager.getLogger(SalePage.class);

	WebDriver driver;
	public SalePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="//span[normalize-space()='Sale']")
	public WebElement sale;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Bags')]")
	public WebElement bagsLink;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Fitness Equipment')]")
	public WebElement fitnessEquipmentLink;
	
	//Actions
	public void clickOnSale()
	{
		log.info("click on Sale Button");

		sale.click();
	}
	public void clickOnBagsLink()
	{
		log.info("click on Bag Link");

		bagsLink.click();
	}
	public void clickOnFitnessEquipmentLink()
	{
		log.info("click on Fitness-Equipment Link");

		fitnessEquipmentLink.click();
	}
	
}
