package CaseStudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario4 
{
	WebDriver driver;
	@Given("TestMeApp url {string}")
	public void testmeapp_url(String string) {
		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
		System.getProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("Login as {string} with {string} Search product like {string}")
	public void login_as_with_Search_product_like(String string, String string2, String string3) throws InterruptedException
	{
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("myInput")).sendKeys(string3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		
	}

	@When("Try to proceed to payment without adding to cart")
	public void try_to_proceed_to_payment_without_adding_to_cart() {
Assert.assertFalse(driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).isDisplayed());

	}
	

	@Then("Icon not found")
	public void icon_not_found() 
	{
		driver.quit();
	  System.out.println("Icon not found"); 
	}

}
