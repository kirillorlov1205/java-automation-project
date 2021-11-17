package com.stormnet.tests.yandex;

import com.stormnet.yandex.framework.driver.UiDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import java.io.ByteArrayInputStream;

public class AbstractTest {

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment.png", new ByteArrayInputStream(takeScreenshotAs()));
		}
		UiDriver.closeDriver();
	}

	private byte[] takeScreenshotAs() {
		return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
}
