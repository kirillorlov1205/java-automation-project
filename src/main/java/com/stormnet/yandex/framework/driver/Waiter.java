package com.stormnet.yandex.framework.driver;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

	private int defaultWaitTimeInSeconds = 5;

	public Waiter(int timeout) {
		defaultWaitTimeInSeconds = timeout;
	}

	public Waiter() {
	}

	public void untilVisible(HtmlElement element, String message){
		new WebDriverWait(UIDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds))
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}
}
