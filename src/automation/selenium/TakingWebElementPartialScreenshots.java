package automation.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakingWebElementPartialScreenshots {
	
	public static void TakingWebElementPartialScreenshotsDemo(WebDriver driver) throws IOException {
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys("Testing");
		
		File file = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("logo.png"));
	}
}
