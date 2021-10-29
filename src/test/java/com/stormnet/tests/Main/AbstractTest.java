package com.stormnet.tests.Main;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

public class AbstractTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		this.driver = driver;
	}

	@AfterMethod
//	public void tearDown(){
//		driver.close();
//	}
	public void takeScreenshotOnFailure(ITestListener result) {
		// TODO: 10/29/2021 Подчеркивает isSuccess 
		if (!result.isSuccess()){
			Allure.attachment("attachment1.png", new ByteArrayInputStream(getScreenshotAs()));
		}
		driver.close();
	}

	private byte[] getScreenshotAs() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}


}
