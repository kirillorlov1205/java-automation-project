package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import com.stormnet.yandex.framework.utility.logerator.Logger;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;

public class MailPageActions {

	public static void waitMailPageOpened() {
		new Waiter().untilInvisible(LoginPage.getUserPasswordField(), "Mail page hasn't been opened");
	}

	public static void waitFileSent() {
		new Waiter().untilVisible(MailPage.getFileSentIndicator(), "file hasn't been sent");
	}

	@Step("Send File to disk")
	public static void sendFileToDisk(File file) {
		String parentWindow = UiDriver.getDriver().getWindowHandle();
		MailPage.getSendingToDiskButton().click();
		new Waiter().waitFrameToBeAvailableAndSwitch(MailPage.getFileSentIframe(), "Frame hasn't been shown");
		MailPageActions.waitFileSent();
		WebElement button = UiDriver.getDriver().findElement(By.xpath("//button[contains(@class,\"tUmQfkSVYK0RxeWDEBvd4\")]"));
		button.click();
		UiDriver.getDriver().switchTo().window(parentWindow);
		Logger.getLogger().info("File '{}' has been sent to disk", file.getName());
	}

}
