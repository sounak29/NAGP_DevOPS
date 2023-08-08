package com.magento.pages;

import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	 Logger log = LogManager.getLogger(SearchPage.class);

	WebDriver driver;
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(how=How.XPATH, using="//input[@id='search']")
	public WebElement search;
	
	@FindBy(how=How.XPATH, using="//button[@title='Search']")
	public WebElement searchBtn;
	
	@FindBy(how=How.ID, using="toolbar-amount")
	public WebElement item;
	
	@FindBy(how=How.XPATH, using="//div[@class='message notice']")
	public WebElement msg;
	
	//Action
	public void enterSearchText(String searchText)
	{
		log.info("enter details on search");

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));

		search.sendKeys(searchText);
	}
	
	public void clickOnSearchBar()
	{
		log.info("click on search bar");

		search.click();
	}
	public void enterSearch()  
	{
		log.info("click on enter button from keyboard");

		search.sendKeys(Keys.ENTER);
	}

	public boolean itemVisibility()  
	{
		log.info("check item visibility");

		return item.isDisplayed();
	}
}
