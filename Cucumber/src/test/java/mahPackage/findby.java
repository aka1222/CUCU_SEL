package mahPackage;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class findby {

	WebDriver driver;
	@Before
	public void init()
	{
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		PageFactory.initElements(driver, filluu.class);
	}
	@After
	public void destroy()
	{
		driver.close();
	}
	
	
	@Given("url of demosite {string}")
	public void url_of_demosite(String string) throws InterruptedException {
		
	    // Write code here that turns the phrase above into concrete actions
	   // 
		// driver= new ChromeDriver(); 
		// driver.manage().window().maximize();
		 //Thread.sleep(1000);
		  driver.get(string);
		  
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
		
	    // Write code here that turns the phrase above into concrete actions
	   //driver.findElement(By.name("Email")).sendKeys(string);
		filluu.email.sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.name("Password")).sendKeys(string);
        filluu.password.sendKeys(string); 
	}


	@Then("user is in webshop")
	public void user_is_in_webshop() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   //driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input")).click();
	   //Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	   //driver.close();
		filluu.signin.click();
		Thread.sleep(3000);
		filluu.signout.click();
	
}}
