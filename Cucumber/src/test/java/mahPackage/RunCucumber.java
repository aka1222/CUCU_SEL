package mahPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-report"},features="src/test/resources/mahPackage/basic.feature",
tags= {"~@tag1","@tag2"})
public class RunCucumber {

}
