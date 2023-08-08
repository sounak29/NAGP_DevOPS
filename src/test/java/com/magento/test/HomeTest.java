package com.magento.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.magento.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomeTest extends Base {
	
	 Logger Homelog = LogManager.getLogger(HomeTest.class);

	
	@Test(description="Verify Women Button on Home Page",groups={"smoke","sanity","Integration"})
	public void WomenButtonTest()
	{		
		Homelog.info("Women Button Test case");

		HomePage women =new HomePage(getDriver());
		women.clickOnWomen();
		
		AssertJUnit.assertEquals(validateProp.getProperty("WomenPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals(validateProp.getProperty("WomenPageTitle"),getDriver().getTitle());
	}
	
	

}
