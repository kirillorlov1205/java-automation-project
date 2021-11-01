package com.stormnet.yandex.actions.loginPageActions;

import com.stormnet.yandex.wrappers.loginPageWrappers.LoginPageWrapper;
import org.openqa.selenium.WebDriver;

public class LoginPageActions {

	private final WebDriver driver;

	public LoginPageActions(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageActions fillUserId(String username) {
		new LoginPageWrapper(driver).getUserIdFieldLocator().sendKeys(username);
		return this;
	}

	public LoginPageActions fillUserPassword(String password) {
		new LoginPageWrapper(driver).getUserPasswordFieldLocator().sendKeys(password);
		return this;
	}

	public LoginPageActions submitForm(){
		new LoginPageWrapper(driver).getLoginSubmitButton().click();
		return this;
	}

	public LoginPageActions loginWithCreds(String userName, String password){
		fillUserId(userName);
		fillUserPassword(password);
		new LoginPageWrapper(driver).getLoginSubmitButton().click();
		return this;
	}

}
