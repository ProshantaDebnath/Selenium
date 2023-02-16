package automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionDemo {

	public static void MouseInteraction(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions m = new Actions(driver);
		
		// code for mouse over a field
		WebElement move = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		m.moveToElement(move).build().perform();
		Thread.sleep(5000);
		
		//Code for Enter Capital keyword in searchBox
		m.moveToElement(driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("test").build().perform();
		
		driver.close();
	}

}
