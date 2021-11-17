package com.stormnet.yandex.framework.driver;

import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

	private int defaultWaitTimeInSeconds = 20;

	public Waiter(int timeout) {
		defaultWaitTimeInSeconds = timeout;
	}

	public Waiter() {
	}

	public void untilVisible(HtmlElement element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds))
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public void untilInvisible(HtmlElement element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds))
				.withMessage(message)
				.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
	}

	public void waitFrameToBeAvailableAndSwitch(HtmlElement element, String message) {
		new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(defaultWaitTimeInSeconds))
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
		UiDriver.getDriver().switchTo().frame(element.getElement());
	}


}
