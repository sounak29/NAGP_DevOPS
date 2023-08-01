package com.magento.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magento.pages.HomePage;
import com.magento.pages.SearchPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SearchTest extends BaseTest {
	
	 Logger Searchlog = LogManager.getLogger(SearchTest.class);

	@DataProvider(name="Valid Search")
	public Object[][] validsearch()
	{
		return new Object[][] {
			{testDataProp.getProperty("ValidSearchItem1")},
			{testDataProp.getProperty("ValidSearchItem2")}
			};
	}
		
	@DataProvider(name="Invalid Search")
	public Object[][] invalidsearch()
	{
		return new Object[][] {
			{testDataProp.getProperty("InvalidSearchItem1")},
			{testDataProp.getProperty("InvalidSearchItem2")}
			};
	}
	
	@Test(dataProvider="Valid Search",description="Verify Search functionality for Valid Search",groups={"smoke","sanity","Integration"})
	public void validSearchTest(String searchtext) 
	{
		Searchlog.info("Valid Search Test case");

		
		SearchPage search=new SearchPage(getDriver());
		search.clickOnSearchBar();
		search.enterSearchText(searchtext);
		search.enterSearch();
		
		//Assertion 
		AssertJUnit.assertEquals(search.itemVisibility(), true);
		AssertJUnit.assertEquals("Search results for: "+"'"+searchtext+"'",getDriver().getTitle());
	}
	
	@Test (dataProvider="Invalid Search",description="Verify Search functionality for Invalid Search",groups={"Integration"})
	public void invalidSearchTest(String searchtext) 
	{		
		Searchlog.info("Invalid Searh Test case");

		SearchPage search=new SearchPage(getDriver());
		search.clickOnSearchBar();
		search.enterSearchText(searchtext);
		search.enterSearch();
		
		//Assertion
		AssertJUnit.assertEquals(validateProp.getProperty("InvalidSearchMessage"),search.msg.getText());

	}
	

}
