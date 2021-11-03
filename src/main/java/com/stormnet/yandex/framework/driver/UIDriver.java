package com.stormnet.yandex.framework.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIDriver {
	private WebDriver driver;
	private static UIDriver instance;

	public UIDriver() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

	public static UIDriver getDriver() {
		if(instance == null){
			instance = new UIDriver();
		}
		return instance;
	}

	public static void closeDriver(){
		instance = null;
	}
}

