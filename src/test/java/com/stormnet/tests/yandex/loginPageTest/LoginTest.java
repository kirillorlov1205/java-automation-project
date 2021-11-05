package com.stormnet.tests.yandex.loginPageTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.framework.actions.loginPageActions.LoginPageActions;
import com.stormnet.yandex.framework.actions.mailPageActions.MailFormActions;
import com.stormnet.yandex.framework.actions.mailPageActions.MailPageActions;
import com.stormnet.yandex.framework.driver.UIDriver;
import com.stormnet.yandex.framework.pageWrappers.loginPageWrappers.LoginPageWrapper;
import com.stormnet.yandex.framework.pageWrappers.mailPageWrappers.MailPageWrapper;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		LoginPageActions.loginWithCreds("+375298812241", "Kirillorlov1997");

		MailPageWrapper.getWriteMailButton().click();

		MailFormActions.fillRecipientField("orlovkirilltest1205@yandex.by");
		MailFormActions.fillTopicField("Hello");


//		mailFormActions.fillRecipientField("kirillorlov1205@yandex.ru");

//		mailFormActions.getSENDING_TO_MYSELF_BUTTON_LOCATOR().click();
//		mailFormActions.getMAIL_TOPIC_FIELD_LOCATOR().click();
	}

}
