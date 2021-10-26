package com.stormnet.tests.lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1Test extends AbstractTest {

	@Test
	public void test() {
		driver.get("https://ru.wikipedia.org");
		WebElement element = driver.findElement(By.className("vector-search-box-input"));
		element.sendKeys("banana", Keys.ENTER);
	}
}
