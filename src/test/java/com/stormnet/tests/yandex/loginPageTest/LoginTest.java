package com.stormnet.tests.yandex.loginPageTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.loginPageActions.LoginPageActions;
import com.stormnet.yandex.framework.actions.mailPageActions.MailPageActions;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailPageWrapper;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageWrapper loginPageWrapper = new LoginPageWrapper(driver);
		LoginPageActions LoginPageActions = new LoginPageActions(driver);
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailPageWrapper mailPageWrapper = new MailPageWrapper(driver);
		MailPageActions mailPageActions = new MailPageActions(driver);

		mailPageWrapper.getWriteMailButton().click();

//		MailFormActions mailFormActions = new MailFormActions(driver);
//
//		mailFormActions.fillTopicField("Hello");

//		mailFormActions.fillRecipientField("kirillorlov1205@yandex.ru");

//		mailFormActions.getSENDING_TO_MYSELF_BUTTON_LOCATOR().click();
//		mailFormActions.getMAIL_TOPIC_FIELD_LOCATOR().click();
	}

}
