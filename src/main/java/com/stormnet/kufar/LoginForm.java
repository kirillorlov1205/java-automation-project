package com.stormnet.kufar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm {
	private static final By USER_NAME_FIELD_LOCATOR = By.id("email");
	private static final By USER_PASSWORD_FIELD_LOCATOR = By.id("password");
	private static final By LOGIN_SUBMIT_BUTTON = By.xpath("//button[@type=\"submit\"");

	private final WebDriver driver;

	public LoginForm(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameField() {
		return driver.findElement(USER_NAME_FIELD_LOCATOR);
	}

	public WebElement getUserPasswordField() {
		return driver.findElement(USER_PASSWORD_FIELD_LOCATOR);
	}

	public WebElement getSubmitButton() {
		return driver.findElement(LOGIN_SUBMIT_BUTTON);
	}
}
