package com.stormnet.tests.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MainTest extends AbstractTest {

	@Test
	public void test() {
		driver.get("https://www.google.by/");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("banana" + Keys.ENTER);

		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class=\"yuRUbf\"]/a"));
		WebElement elementOfList = searchResults.get(2);
		elementOfList.click();

// TODO: 10/26/2021 как описать тест, чтобы проверить, что открылась именно третья страница из списка ?
	}
}
