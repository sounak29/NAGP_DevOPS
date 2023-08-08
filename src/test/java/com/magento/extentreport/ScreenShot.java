package com.magento.extentreport;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ScreenShot {
	static Logger log = LogManager.getLogger(ScreenShot.class);

	public static String takeScreenshot(WebDriver driver,String name)
	{
		log.info("Take Screenshot Method called");

		String screenshotPath = System.getProperty("user.dir")+"/FaildedScreenshot/"+name+".jpg";
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(screenshotPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;
	}

	
}
