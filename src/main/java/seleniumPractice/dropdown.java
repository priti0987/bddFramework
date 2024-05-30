package seleniumPractice;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;
 public class dropdown {
 public static void main(String[] args) {
 // Set the path of the ChromeDriver executable
 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
// Launch Chrome browser
 WebDriver driver = new ChromeDriver(); 
// Find the dropdown/select element
 WebElement dropdown = driver.findElement(By.id("dropdown-id")); 
// Create a Select object
 Select select = new Select(dropdown); 
// Select by visible text
 select.selectByVisibleText("Option 1"); 
// Select by value
 select.selectByValue("option-2-value"); 
// Select by index
 select.selectByIndex(2); 
// Deselect all options
 select.deselectAll(); 
// Perform further actions on the dropdown
 // ... 
// Close the browser
 driver.quit();
 }
 }
