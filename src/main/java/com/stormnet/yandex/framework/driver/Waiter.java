package com.stormnet.yandex.framework.driver;

import com.stormnet.yandex.framework.elements.HtmlElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {

	public static WebDriverWait getWait(TIMEOUT timeInSeconds) {
		return new WebDriverWait(UiDriver.getDriver(), Duration.ofSeconds(timeInSeconds.seconds));
	}

	public static void untilVisible(HtmlElement element, String message) {
		getWait(TIMEOUT.TWENTY_SEC)
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
	}

	public static void untilInvisible(HtmlElement element, String message) {
		getWait(TIMEOUT.TWENTY_SEC)
				.withMessage(message)
				.until(ExpectedConditions.invisibilityOfElementLocated(element.getLocator()));
	}

	public static void waitFrameToBeAvailableAndSwitch(HtmlElement element, String message) {
		getWait(TIMEOUT.TWENTY_SEC)
				.withMessage(message)
				.until(ExpectedConditions.visibilityOfElementLocated(element.getLocator()));
		UiDriver.getDriver().switchTo().frame(element.getElement());
	}

	public static enum TIMEOUT {
		TWENTY_SEC(20),
		THIRTY_SEC(30);

		int seconds;

		TIMEOUT(int seconds) {
			this.seconds = seconds;
		}

		public int getSeconds() {
			return seconds;
		}
	}


}
