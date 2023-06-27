package automation.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class InvokeMultipleWindows {
	
	public static void InvokeMultipleWindowsDemo(WebDriver driver) {
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='get-access-to-all-courses']")).get(1).getText();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
	}

}
