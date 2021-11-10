package com.stormnet.other.lesson23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2Test extends AbstractTest {

	@Test
	public void test(){
		driver.get("https://www.youtube.com");

		WebElement searchField = driver.findElement(By.name("search_query"));
		searchField.click();

		searchField.sendKeys("banana" + Keys.ENTER);
// TODO: 10/24/2021 не всегда вводит слово banan, если почистить с
//  помощью clean - работает, и то не всегда. В режиме дебага - тест работает

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");

		new WebDriverWait(driver, Duration.ofSeconds(5))
				.withMessage("No search result")
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title = \"Minions   Banana Song Full Song)\"]")));
		WebElement video = driver.findElement(By.xpath("//a[@title = \"Minions   Banana Song Full Song)\"]"));

		video.click();

		String windowTitle = driver.getTitle();
		Assert.assertEquals(windowTitle, "Minions Banana Song Full Song) - YouTube","Title of the page doesnt match");
	}
}

