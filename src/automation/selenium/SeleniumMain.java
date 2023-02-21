package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumMain {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Proshanta\\Desktop\\Selenium Project\\MicrosoftEdgeDriver.exe");

		WebDriver driver = new EdgeDriver();
		
		
		/* 1.code for test browser */
		//TestLaunchDemo.testLaunch(driver);
		
		/* 2.code for Practice1 */
		//WaitExcerisePracticeDemo.WaitExcerisePractice(driver);
		
		/* 3.code for MouseInteraction */
		//MouseInteractionDemo.MouseInteraction(driver);
		
		/* code for Window handle */
		WindowHandleDemo.windowHandler(driver);
	}
}
