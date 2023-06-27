package automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMain {
	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Proshanta\\Desktop\\Selenium Project\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		
		
		/* 1.code for test browser */
		//TestLaunchDemo.testLaunch(driver);
		
		/* 2.code for Practice1 */
		//WaitExcerisePracticeDemo.WaitExcerisePractice(driver);
		
		/* 3.code for MouseInteraction */
		//MouseInteractionDemo.MouseInteraction(driver);
		
		/* 4.code for Window handle */
		//WindowHandleDemo.windowHandler(driver);
		
		/* 4.Relative loactor selenium 4 features*/
		RelativeLocator.RelativeLocatorDemo(driver);
		
		
		
	}
}
