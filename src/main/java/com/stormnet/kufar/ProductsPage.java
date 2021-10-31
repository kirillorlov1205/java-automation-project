package com.stormnet.kufar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	private WebDriver driver;
	private HeaderPanel headerPanel;
	private static final By MAIN_TAB_BUTTON_LOCATOR = By.xpath("//h2[@data-tab=\"main_listing_tab\"]");

	public ProductsPage(WebDriver driver){
		this.headerPanel = new HeaderPanel(driver);
		this.driver = driver;
	}

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	public void waitUntilOpened(){
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.withMessage("Page wasn't oppened")
				.until(ExpectedConditions.visibilityOfElementLocated(MAIN_TAB_BUTTON_LOCATOR));
	}
}
