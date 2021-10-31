package com.stormnet.tests.kufarTests;

import com.stormnet.kufar.HeaderPanel;
import com.stormnet.kufar.ProductsPage;
import com.stormnet.kufar.actions.loginPage.LoginFormActions;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {

	@Test(testName = "Login with right credentials")
	public void LoginTestRightCredentials() {
		driver.get("https://www.kufar.by/l/r~minsk");

		HeaderPanel headerPanel = new HeaderPanel(driver);
		headerPanel.getOpenLoginForm().click();


		LoginFormActions loginFormActions = new LoginFormActions(driver);
		ProductsPage productsPage = new LoginFormActions(driver).fillUserName("Kirillorlov1205@gmail.com")
				.fillPassword("Kirillorlov1997")
				.submitForm();

		productsPage.waitUntilOpened();
	}
}
