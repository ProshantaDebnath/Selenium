package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumMain {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Proshanta\\Desktop\\Selenium Project\\MicrosoftEdgeDriver.exe");

		WebDriver driver = new EdgeDriver();
		
		
		/* code for test browser */
		//TestLaunchDemo.testLaunch(driver);
		
		/* code for Practice1 */
		WaitExcerisePracticeDemo.WaitExcerisePractice(driver);
	}
}
