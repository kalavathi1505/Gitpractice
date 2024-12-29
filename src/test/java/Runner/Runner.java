package Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feature/Automate_testing.feature",
glue = "Stepdefinition",
publish = true,
plugin = {"pretty", "junit:target/cucumber-report.xml"},
monochrome = true)


public class Runner extends Base {
	
	public static WebDriver driver;

	@BeforeClass
	public static void start() {
		
		BrowserLanuch();
		maximise();


}
}
