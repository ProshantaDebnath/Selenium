package automation.selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableSorting {

	public static void webTableSortingDemo(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[text()='Veg/fruit name']")).click();

		
		/* compared two list and checked if they are sorted ordered or not */
		List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = elementList.stream().map(e -> e.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(originalList.equals(sortedList));

		List<String> price;
		do {
		/* custom methods to get price for a specific fruits */
		List<WebElement> rowList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		price = rowList.stream().filter(e -> e.getText().contains("Rice")).map(s -> getPrice(s))
				.collect(Collectors.toList());
		
		price.forEach(e->System.out.println(e));
		/* pagination */
		if(price.size()<1) {
			driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
		 }
		}while(price.size()<1);
	}

	public static String getPrice(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}
}
