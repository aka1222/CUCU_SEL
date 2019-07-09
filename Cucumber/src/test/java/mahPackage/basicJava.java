package mahPackage;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class basicJava {
	
	Person saun = new Person();
	 
	@Given("saun is {int}Km away from luca")
	public void saun_is_Km_away_from_luca(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		saun.setDistance(int1);
	}

	@When("saun shouts {string}")
	public void saun_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    saun.setMessage(string);
	}

	@Then("luca (cannot listen|listens) to the message")
	public void luca_listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    String message=saun.getMessage();
	    Assert.assertEquals("Dont Run", message);
	}



}
