package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void RelativeLocatorDemo(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement nameTag = driver.findElement(By.cssSelector("[name='name']"));
		String text = driver.findElement(with(By.tagName("label")).above(nameTag)).getText();
		System.out.println(text);

		WebElement dateOfBirthTag = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirthTag)).click();
		WebElement iceCreamLabel = driver
				.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));

		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

		WebElement rdb = driver.findElement(By.id("inlineRadio1"));

		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
//		driver.close();
	}

}
