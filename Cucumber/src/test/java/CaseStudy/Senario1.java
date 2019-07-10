package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Senario1 
{
	WebDriver driver;
 
	@Given("URL of TestMeApp {string}")
	public void url_of_TestMeApp(String string)  {
	   
	    String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver",path);
		 driver= new ChromeDriver(); 
		 driver.manage().window().maximize();
		  driver.get(string);
		  
	}

	@When("Enter username {string} as uname")
	public void enter_username_as_uname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(string);
	   //throw new cucumber.api.PendingException();
	}

	@When("Enter First Name {string} as fname")
	public void enter_First_Name_as_fname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("Enter Last Name {string} as lname")
	public void enter_Last_Name_as_lname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("Enter Password {string} as pass")
	public void enter_Password_as_pass(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(string);
		
	}

	@When("Enter Confirm Password {string} as cpass")
	public void enter_Confirm_Password_as_cpass(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}
	@When("Enter your gender")
	public void enter_your_gender() {
	
		driver.findElement(By.name("gender")).click();
	
	}
	@When("Enter {string} as email")
	public void enter_as_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
     driver.findElement(By.name("emailAddress")).sendKeys(string);
	}


	@When("Enter {long} as your Mobile number")
	public void enter_as_your_Mobile_number(Long int1) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("mobileNumber")).sendKeys(String.valueOf(int1));
	}

	@When("Enter {string} as your DOB")
	public void enter_as_your_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("Enter {string} as your address")
	public void enter_as_your_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("address")).sendKeys(string);
	}

	@When("Enter {string} in Answer")
	public void enter_in_Answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("answer")).sendKeys(string);
	}

	@Then("Register")
	public void register() throws InterruptedException {
	  driver.findElement(By.name("Submit")).click();
	  Thread.sleep(2000);
	  driver.quit();
	}

	
}
