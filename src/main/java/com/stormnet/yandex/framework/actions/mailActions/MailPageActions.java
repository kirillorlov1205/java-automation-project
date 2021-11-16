package com.stormnet.yandex.framework.actions.mailActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.elements.Button;
import com.stormnet.yandex.framework.elements.HtmlElement;
import com.stormnet.yandex.framework.pageWrappers.LoginPage;
import com.stormnet.yandex.framework.pageWrappers.mailWrappers.MailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MailPageActions {

	public static void waitMailPageOpened() {
		new Waiter().untilInvisible(LoginPage.getUserPasswordFieldLocator(), "Mail page hasn't been opened");
	}

	public static void waitFileSent() {
		new Waiter().untilVisible(MailPage.getFileSentPopUp(), "file hasn't been sent");
	}


	public static void sendFileToDisk() {
		MailPage.getSendingToDiskButton().click();
		new Waiter().waitFrameToBeAvailableAndSwitch(MailPage.getFileSentIframe(),"Frame hasn't been shown");

//		MailPageActions.waitFileSent();
//		waitMailPageOpened();
	}

}
