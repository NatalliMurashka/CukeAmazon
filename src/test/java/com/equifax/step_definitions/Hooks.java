package com.equifax.step_definitions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.equifax.utilities.ConfigReader;
import com.equifax.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
	@Before ()
	public void setUp() {
		
		Driver.getDriver().manage().timeouts().implicitlyWait(
				(Long.parseLong(ConfigReader.getConfiguration("implicitTimeout"))), TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();


	}
	
		
	
	@After()
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			
			String date = new SimpleDateFormat("yyMMddhhmmss").format(new Date());
			scenario.embed(screenshot, "image/png", "screenshot" + date);
					}
		Driver.closeDriver();
	}

	
}
