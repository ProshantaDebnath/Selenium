package automation.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowHandleDemo {

	public static void windowHandler(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.xpath("//*[contains(text(),'Free Access to InterviewQues')]")).click();
		Set<String> windows = driver.getWindowHandles(); // 0-parent 1-child
		System.out.println(windows);
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		driver.close();

	}

}
