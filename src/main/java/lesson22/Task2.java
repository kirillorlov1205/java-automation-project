package lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.WindowState;

import java.awt.*;
import java.awt.image.Kernel;

public class Task2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com");

		WebElement searchField = driver.findElement(By.name("search_query"));
		searchField.click();
		searchField.sendKeys("banana" + Keys.ENTER);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");


		WebElement video = driver.findElement(By.xpath("//a[@title = \"Minions   Banana Song Full Song)\"]"));
		video.click();


		driver.close();
	}
}
