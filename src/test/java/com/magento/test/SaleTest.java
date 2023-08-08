package com.magento.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.magento.pages.SalePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SaleTest extends Base {
	
	 Logger Salelog = LogManager.getLogger(SaleTest.class);

	@Test(description="Verify Bags Link on Sale Page",groups={"smoke","Integration"})
	public void BagsLinkTest()
	{
		Salelog.info("Bag Link Test case");

		SalePage sale =new SalePage(getDriver());
		sale.clickOnSale();
		sale.clickOnBagsLink();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("BagsPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals( validateProp.getProperty("BagsPageTitle"),getDriver().getTitle());
	}
	
	@Test(description="Verify Fitness-Equipment Link on Sale Page", groups={"smoke","sanity","Integration"})
	public void FitnessEquipmentLinkTest()
	{		
		Salelog.info("Fitness-Equipment Link Test case");

		SalePage sale =new SalePage(getDriver());
		sale.clickOnSale();
		sale.clickOnFitnessEquipmentLink();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("FitnessEquipmentPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals( validateProp.getProperty("FitnessEquipmentPageTitle"),getDriver().getTitle());
	}

}
