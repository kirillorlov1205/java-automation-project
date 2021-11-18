package com.stormnet.tests.yandex;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.utility.fileManager.FileManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;
import java.io.File;

public class AbstractTest {

	public File file;
	@BeforeMethod
	public void start (ITestResult result) {
		file = FileManager.generateFile();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (!result.isSuccess()) {
			Allure.attachment("attachment.png", new ByteArrayInputStream(takeScreenshotAs()));
		}
		file.delete();
		UiDriver.closeDriver();
	}

	private byte[] takeScreenshotAs() {
		return ((TakesScreenshot) UiDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	}
}
