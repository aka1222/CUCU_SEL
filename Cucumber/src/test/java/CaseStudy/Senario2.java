package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario2
{
	WebDriver driver;

	@Given("Open Link {string}")
	public void open_Link(String string) throws InterruptedException {
	 
		  String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver",path);
			 driver= new ChromeDriver();
			 driver.manage().window().fullscreen();
			 Thread.sleep(1000);
			  driver.get(string);
	}

	@When("Please Enter {string} as Username")
	public void please_Enter_as_Username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
driver.findElement(By.id("userName")).sendKeys(string);
	}


	@When("Please Enter {string} as Password")
	public void please_Enter_as_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("Hit Login button")
	public void hit_Login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		driver.quit();
	}


}
