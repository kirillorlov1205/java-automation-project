package com.stormnet.tests.yandex.loginPageTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.loginPageActions.LoginPageActions;
import com.stormnet.yandex.framework.actions.mailPageActions.MailFormActions;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailPageWrapper;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailPageWrapper.getWriteMailButton().click();

		MailFormActions.fillRecipientField("orlovkirilltest1205@yandex.by");
		MailFormActions.fillTopicField("Hello");



	}

}
