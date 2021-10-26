import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.by/");

		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("banana" + Keys.ENTER);
//		WebElement link = driver.findElement(By.xpath("//a[@href=\"https://banana.by/\"]"));
//		link.click();


		List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class=\"yuRUbf\"]/a"));
		WebElement elementOfList = searchResults.get(2);
		elementOfList.click();
		WebElement elementOfList1 = searchResults.get(2);

	}
}
