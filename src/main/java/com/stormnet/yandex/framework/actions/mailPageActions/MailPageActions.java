package com.stormnet.yandex.framework.actions.mailPageActions;

import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailFormWrapper;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPageActions {
	public WebDriver driver;

	public MailPageActions(WebDriver driver) {
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

	public void waitMailPageOpened(){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.withMessage("Mail page hasn't been opened")
				.until(ExpectedConditions.invisibilityOf(new LoginPageWrapper(driver).getUserPasswordFieldLocator().getElement()));
	}


}
