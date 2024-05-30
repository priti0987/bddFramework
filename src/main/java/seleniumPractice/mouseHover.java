package seleniumPractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class mouseHover {
	public static void main(String[] args) {
		 // Set the path of the ChromeDriver executable
		 //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
		 // Launch Chrome browser
		 WebDriver driver = new ChromeDriver(); 
		 driver.get("https://icicibank.com");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
		 
		// Find the element to hover over
		 WebElement element = driver.findElement(By.xpath("//span[@class='menu-txt active']")); 
		// Create an Actions object
		 Actions actions = new Actions(driver); 
		// Perform mouse hover action
		 actions.moveToElement(element).perform(); // .....................................
		// Perform further actions after the mouse hover
		 // ... 
		 System.out.println(element);
		 
		 System.out.println(driver.findElement(By.xpath("  //a[text()='Savings Account']")).isDisplayed());
		// Close the browser
		 driver.quit();
		 }
		 }


