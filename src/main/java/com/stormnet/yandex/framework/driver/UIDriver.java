package com.stormnet.yandex.framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIDriver {
	private static ThreadLocal<UIDriver> instance = new ThreadLocal<>();
	private final WebDriver driver;

	public UIDriver() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

	public static WebDriver getDriver() {
		if (instance.get() == null) {
			instance.set(new UIDriver());
		}
		return instance.get().driver;
	}

	public static void closeDriver() {
		getDriver().quit();
		instance.set(null);
	}

}

