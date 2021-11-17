package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MailPageActions {

	public static void waitMailPageOpened() {
		new Waiter().untilInvisible(LoginPage.getUserPasswordFieldLocator(), "Mail page hasn't been opened");
	}

	public static void waitFileSent() {
		new Waiter().untilVisible(MailPage.getFileSentIndicator(), "file hasn't been sent");
	}

	public static void sendFileToDisk() {
		String parentWindow = UiDriver.getDriver().getWindowHandle();
		MailPage.getSendingToDiskButton().click();
		new Waiter().waitFrameToBeAvailableAndSwitch(MailPage.getFileSentIframe(), "Frame hasn't been shown");
		MailPageActions.waitFileSent();
		WebElement button = UiDriver.getDriver().findElement(By.xpath("//button[contains(@class,\"tUmQfkSVYK0RxeWDEBvd4\")]"));
		button.click();
		UiDriver.getDriver().switchTo().window(parentWindow);
	}

}
