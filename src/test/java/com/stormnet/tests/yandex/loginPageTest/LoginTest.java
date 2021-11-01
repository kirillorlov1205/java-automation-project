package com.stormnet.tests.yandex.loginPageTest;


import com.stormnet.tests.yandex.AbstractTest;
import com.stormnet.yandex.actions.loginPageActions.LoginPageActions;
import com.stormnet.yandex.actions.mailPageActions.MailFormActions;
import com.stormnet.yandex.wrappers.loginPageWrappers.LoginPageWrapper;
import com.stormnet.yandex.wrappers.mailPageWrappers.MailPageWrapper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login to the system")
	public void LoginTestRightCredentials() {
		driver.get("https://passport.yandex.by/auth?from=mail&origin=hostroot_homer_auth_L_by&retpath=https%3A%2F%2Fmail.yandex.by%2F&backpath=https%3A%2F%2Fmail.yandex.by%3Fnoretpath%3D1/");

		LoginPageWrapper loginPageWrapper = new LoginPageWrapper(driver);
		LoginPageActions LoginPageActions = new LoginPageActions(driver)
				.fillUserId("+375298812241")
				.submitForm();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(loginPageWrapper.getUserIdFieldLocator()));

		LoginPageActions.fillUserPassword("Kirillorlov1997")
				.submitForm();

		MailPageWrapper mailPageWrapper = new MailPageWrapper(driver);

		wait.withMessage("Mail page hasn't been opened")
				.until(ExpectedConditions.invisibilityOf(loginPageWrapper.getUserPasswordFieldLocator()));

		mailPageWrapper.getWriteMailButton().click();

		MailFormActions mailFormActions = new MailFormActions(driver);


		mailFormActions.fillTopicField("Hello");

//		mailFormActions.fillRecipientField("kirillorlov1205@yandex.ru");

//		mailFormActions.getSENDING_TO_MYSELF_BUTTON_LOCATOR().click();
//		mailFormActions.getMAIL_TOPIC_FIELD_LOCATOR().click();
	}


//	@Test(testName = "Fill the mail form")
//	public void fillMailForm() {
//
//		MailPageWrapper mailPageWrapper = new MailPageWrapper(driver);
//		mailPageWrapper.getWriteMailButton().click();
//	}

}
