package CaseStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario3 
{
	WebDriver driver;
	@Given("URL for login {string}")
	public void url_for_login(String string) {
		String path = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\Selenium_Aakash\\jar\\chromedriver.exe";
		System.getProperty("webdriver.chrome.driver",path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
		
	}

	@When("user name for login {string}")
	public void user_name_for_login(String string) {
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("password for login {string}")
	public void password_for_login(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("login and search for product {string}")
	public void login_and_search_for_product(String string) throws InterruptedException {
		driver.findElement(By.name("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("myInput")).sendKeys(string);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("Add to cart")
	public void add_to_cart() {
		
	   driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	   driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
	   driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
	}

	@When("then proceed for payment with Andhra Bank credential {int} {string} {string}")
	public void then_proceed_for_payment_with_Andhra_Bank_credential(Integer int1, String string, String string2) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.name("username")).sendKeys(String.valueOf(int1));
		driver.findElement(By.name("password")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    driver.findElement(By.name("transpwd")).sendKeys(string2);	
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();	
	
	}
	@Then("finish payment and exit")
	public void finish_payment_and_exit() throws InterruptedException {
		Thread.sleep(6000);
	    driver.quit();
	}

}
