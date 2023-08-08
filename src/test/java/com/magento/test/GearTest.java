package com.magento.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.magento.pages.GearPage;


public class GearTest extends Base {
	 Logger GearLog = LogManager.getLogger(GearTest.class);

	
	@Test(description="Verify Bag Button on Gear Page", groups={"smoke","sanity","Integration"})
	public void BagButtonTest()
	{
		GearLog.info("Bag Button Test case");

		GearPage gear =new GearPage(getDriver());
		gear.clickOnGear();
		gear.mouseOverOnGear();
		gear.clickOnBag();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("BagsPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals(validateProp.getProperty("BagsPageTitle"),getDriver().getTitle());
				
	}
	@Test(description="Verify Fitness-Equipment Button on Gear Page", groups={"smoke","Integration"})
	public void FitnessEquipmentButtonTest() 
	{		
		GearLog.info("Fitness-Equipment Button Test case");

		GearPage gear =new GearPage(getDriver());
		gear.clickOnGear();
		gear.mouseOverOnGear();
		gear.clickOnFitnessEquipment();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("FitnessEquipmentPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals(validateProp.getProperty("FitnessEquipmentPageTitle"),getDriver().getTitle());
	
	}
	@Test(description="Verify Watches Button on Gear Page", groups={"smoke","Integration"})
	public void WatchesButtonTest() 
	{
		GearLog.info("Watches Button Test case");

		GearPage gear =new GearPage(getDriver());
		gear.clickOnGear();
		gear.mouseOverOnGear();
		gear.clickOnWatches();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("WatchesPageURL"),getDriver().getCurrentUrl());
		AssertJUnit.assertEquals(validateProp.getProperty("WatchesPageTitle"),getDriver().getTitle());
	
	}

}
