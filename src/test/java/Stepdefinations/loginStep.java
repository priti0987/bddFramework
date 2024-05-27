package Stepdefinations;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@And("Close page")
public void close_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}



}
