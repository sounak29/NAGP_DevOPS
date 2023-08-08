package com.magento.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class GearPage {
	
	 Logger log = LogManager.getLogger(GearPage.class);

	
	WebDriver driver;
	public GearPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how=How.XPATH, using="//span[normalize-space()='Gear']")
	public WebElement gear;
	
	//Action
	public void clickOnGear()
	{
		log.info("click on Gear Button");
		gear.click();
	}
	
	public void mouseOverOnGear() 
	{
		log.info("mouse over on Gear Button");
		Actions action=new Actions(driver);
		action.moveToElement(gear).perform();
						
	}
	
	public void clickOnBag()
	{
		log.info("click on Bag Button from drop-down");

		driver.findElement(By.xpath("//span[normalize-space()='Bags']")).click();
	}
	
	public void clickOnFitnessEquipment()
	{
		log.info("click on Fitness-Equipment Button from drop-down");

		driver.findElement(By.xpath("//span[normalize-space()='Fitness Equipment']")).click();
	}
	
	public void clickOnWatches()
	{
		log.info("click on Watches Button from drop-down");

		driver.findElement(By.xpath("//span[normalize-space()='Watches']")).click();
	}
}
