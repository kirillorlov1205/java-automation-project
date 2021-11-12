package com.stormnet.yandex.framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UiDriver {
	private static ThreadLocal<UiDriver> instance = new ThreadLocal<>();
	private final WebDriver driver;
	private static final Logger logger = LoggerFactory.getLogger("legger");


	private UiDriver() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		logger.debug("Driver started");
	}

	public static WebDriver getDriver() {
		if (instance.get() == null) {
			instance.set(new UiDriver());
		}
		return instance.get().driver;
	}

	public static void closeDriver() {
		getDriver().quit();
		instance.set(null);
		logger.debug("Driver closed");
	}

}

