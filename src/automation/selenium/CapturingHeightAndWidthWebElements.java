package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapturingHeightAndWidthWebElements {
	
	public static void CapturingHeightAndWidthWebElementsDemo(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println("Height of the WebElement is " + name.getRect().getHeight());
		System.out.println("Height of the WebElement is " + name.getRect().getDimension().getWidth());
	}

}
