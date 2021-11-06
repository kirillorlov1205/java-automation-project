package com.stormnet.yandex.framework.actions.mailPageActions;

import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailFormWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailPageWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

public class MailFormActions {

	public static void fillRecipientField(String email) {
		new Waiter().untilVisible(MailFormWrapper.getMailRecipientField(),"Mail form hasn't been opened");
		MailFormWrapper.getMailRecipientField().sendKeys(email);
	}

	public static void fillTopicField(String topic) {
		MailFormWrapper.getMailTopicField().sendKeys(topic);
	}


}
