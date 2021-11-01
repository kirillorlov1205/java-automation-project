package com.stormnet.yandex.actions.mailPageActions;

import com.stormnet.yandex.wrappers.mailPageWrappers.MailFormWrapper;
import org.openqa.selenium.WebDriver;

public class MailFormActions {
	public WebDriver driver;

	public MailFormActions(WebDriver driver) {
		this.driver = driver;
	}

	public void fillRecipientField(String email) {
		new MailFormWrapper(driver).getMAIL_RECIPIENT_FIELD_LOCATOR().sendKeys(email);
	}

	public void fillTopicField(String topic) {
		MailFormWrapper mailFormWrapper = new MailFormWrapper(driver);
		mailFormWrapper.getMAIL_TOPIC_FIELD_LOCATOR().click();
		mailFormWrapper.getMAIL_TOPIC_FIELD_LOCATOR().sendKeys(topic);
	}


}
