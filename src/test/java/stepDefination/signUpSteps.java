package stepDefination;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signUpSteps {
	WebDriver driver;

	
	@Given("user launch site")
	public void user_launch_site() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("enter username and password")
	public void enter_username_and_password() {
	   
		WebElement username =driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");	
		WebElement pass =  driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
		WebElement btn =driver.findElement(By.id("login-button"));
		btn.click();
		
		
	}

	@Then("Validate error message")
	public void validate_error_message() {

		WebElement logo =driver.findElement(By.cssSelector("span.title"));
		assertTrue(logo.isDisplayed());
		
	}


}
