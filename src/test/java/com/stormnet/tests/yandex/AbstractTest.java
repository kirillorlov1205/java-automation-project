package com.stormnet.tests.yandex;

import com.stormnet.yandex.framework.driver.UIDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;

public class AbstractTest {
	protected UIDriver driver;

	@BeforeMethod
	public void setup() {
		UIDriver driver = UIDriver.getDriver();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment2.png", new ByteArrayInputStream(takeScreenshotAs()));
		}
		UIDriver.closeDriver();
	}

	private byte[] takeScreenshotAs() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
}
