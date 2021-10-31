package com.stormnet.yandex.loginPageActions;

import com.stormnet.kufar.ProductsPage;
import com.stormnet.yandex.loginPageWrappers.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {

	private final WebDriver driver;

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageActions fillUserId(String username) {
		new LoginPage(driver).getUserIdFieldLocator().sendKeys(username);
		return this;
	}

	public LoginPageActions fillUserPassword(String password) {
		new LoginPage(driver).getUserPasswordFieldLocator().sendKeys(password);
		return this;
	}

	public LoginPageActions submitForm(){
		new LoginPage(driver).getLoginSubmitButton().click();
		return this;
	}

	public LoginPageActions loginWithCreds(String userName, String password){
		fillUserId(userName);
		fillUserPassword(password);
		new LoginPage(driver).getLoginSubmitButton().click();
		return this;
	}

}
