package com.stormnet.kufar.actions.loginPage;

import com.stormnet.kufar.ProductsPage;
import com.stormnet.kufar.page_wrappers.loginPage.LoginForm;
import org.openqa.selenium.WebDriver;

public class LoginFormActions {
	static WebDriver driver;

	public LoginFormActions(WebDriver driver) {
		this.driver = driver;
	}


	public  LoginFormActions fillUserName(String username){
		new LoginForm(driver).getUserNameField().sendKeys("username");
		return this;
	}

	public  LoginFormActions fillPassword(String password){
		new LoginForm(driver).getUserPasswordField().sendKeys("password");
		return this;
	}

	public ProductsPage submitForm(){
		new LoginForm(driver).getSubmitButton().click();
		return new ProductsPage(driver);
	}

	public ProductsPage loginWithCreds(String userName, String password){
		fillUserName(userName);
		fillPassword(password);
		new LoginForm(driver).getSubmitButton().click();
		return new ProductsPage(driver);
	}
}
