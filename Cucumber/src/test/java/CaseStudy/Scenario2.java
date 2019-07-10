package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2 
{
	WebDriver driver;
	@Given("Open LogIn Page {string}")
	public void open_LogIn_Page(String string) {
		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
		System.getProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Give {string} as user name")
	public void give_as_user_name(String string) {
	   driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("Give {string} as password")
	public void give_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("Hit on Login")
	public void hit_on_Login() throws InterruptedException {
	    driver.findElement(By.name("Login")).click();
	    Thread.sleep(2000);
	    driver.quit();
	}
}
