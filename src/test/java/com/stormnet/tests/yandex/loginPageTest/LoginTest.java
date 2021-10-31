package com.stormnet.tests.yandex.loginPageTest;


import com.stormnet.yandex.loginPageActions.LoginPageActions;
import com.stormnet.yandex.loginPageWrappers.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test
	public void LoginTestRightCredentials() {
		driver.get("https://passport.yandex.by/auth?from=mail&origin=hostroot_homer_auth_L_by&retpath=https%3A%2F%2Fmail.yandex.by%2F&backpath=https%3A%2F%2Fmail.yandex.by%3Fnoretpath%3D1/");

		LoginPage loginPage = new LoginPage(driver);
		LoginPageActions LoginPageActions = new LoginPageActions(driver)
				.fillUserId("+375298812241")
				.submitForm();

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.withMessage("ID field hasn't disappear")
				.until(ExpectedConditions.invisibilityOf(loginPage.getUserIdFieldLocator()));


		LoginPageActions.fillUserPassword("Kirillorlov1997")
				.submitForm();
	}

}
