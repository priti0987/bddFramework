package Stepdefinations;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;



public class loginStep {

	static WebDriver driver;
	
@Given("User is on Login page")
public void user_is_on_login_page() {

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.saucedemo.com/v1/");

}

@When("User enters valid username and password")
public void user_enters_valid_username_and_password() {


	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
}

@And("Click on Login page")
public void click_on_login_page() {


	driver.findElement(By.id("login-button")).click();
}

@Then("User is navigated to home page")
public void user_is_navigated_to_home_page() {

	Assert.assertTrue((driver.findElement(By.xpath("//div[@class=\"app_logo\"]")).isDisplayed()), "User is navigated to home page");

	
}

@And("Close page")
public void close_page() {
	
	driver.quit();
	
}



}
