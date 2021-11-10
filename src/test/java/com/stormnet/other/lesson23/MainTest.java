package com.stormnet.other.lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainTest extends AbstractTest {

	@Test
	public void test() {
		driver.get("https://www.google.by/");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("banana" + Keys.ENTER);

		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class=\"yuRUbf\"]/a"));
		WebElement element = searchResults.get(0);
		element.click();
	}
}
