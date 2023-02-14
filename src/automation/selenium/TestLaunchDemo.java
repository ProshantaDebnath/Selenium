package automation.selenium;

import org.openqa.selenium.WebDriver;

public class TestLaunchDemo {

	public static void testLaunch(WebDriver driver) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
