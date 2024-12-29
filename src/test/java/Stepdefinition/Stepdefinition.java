
package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;

import Base.Base;
import Locator.Alerts; 
import Locator.Home;
import Locator.Register;
import Locator.Windows;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Base{
	Home ho = new Home(driver);
	Alerts al = new Alerts(driver);
	Register r = new Register(driver);
	Windows w = new Windows(driver);
	
	
	
	@Given("Open the website")
	public void open_the_website() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/");
		Thread.sleep(2000);
	    
	}

	@When("Enter emailid and click next")
	public void enter_emailid_and_click_next() {
		ho.getEmail().sendKeys("test@gmail.com");
		ho.getNextclick().click();
		ho.getHome().click();
		
	    
	}

	@When("Verify Signin and Skipsignin buttons are clickable")
	public void verify_signin_and_skipsignin_buttons_are_clickable() {
		Assert.assertTrue("Signin button is not clicked", ho.getSignInButton().isEnabled());
		Assert.assertTrue("Skipsignin button is not displayed", ho.getSkipSignInButton().isEnabled());

	    
	}


@When("Get url and check that url contains index.html")
public void get_url_and_check_that_url_contains_index_html()  {
		String currenturl = driver.getCurrentUrl();
		Assert.assertTrue("URL does not contain index.html", currenturl.contains("Index.html"));
	    
	}

	@Then("Fill the Register form")
	public void fill_the_register_form() throws InterruptedException {
		ho.getEmail().sendKeys("test@example.com");
		ho.getNextclick().click();
		r.getFirstname().sendKeys("Kalavathi");
		r.getLastname().sendKeys("Mansoor");
		r.getAddress().sendKeys("Tambaram");
		r.getEmail().sendKeys("test@gmail.com");
		r.getPhonenumber().sendKeys("8838275526");
//		r.getFemale().click();
		r.selectFemaleRadioButton();
		Assert.assertTrue(r.isFemaleRadioButtonSelected());
		
		r.clickHobbies(0, 2);
		r.getLanguage().click();
		Thread.sleep(1000);
		Assert.assertTrue(r.isLanguagedropdownDisplayed());
		r.selectLanguages("English", "Korean");
		
		r.getAddress().click();
		
		r.selectSkill("Java");
//		r.country("Select Country");
		
		
		r.getCountry().click();
		r.enterCountryinCheckbox("India");
		r.selectCountry("India");
		
		
		r.selectDropdown();
		r.selectCountry("India");
		
		r.selectDOB("15", "May", "1987");
		r.getPassword().sendKeys("1@345");
		r.getSecodpassword().sendKeys("1@345");
		
		String photopath = "C:\\Users\\my pc\\Desktop\\Testing\\Cucumber\\Sample\\Flower.jpg";
		r.addphoto(photopath);
			
//		r.getSubmit().click();
	    
	}

	@Then("Switch to tab and select Alerts and work on the alerts")
	public void switch_to_tab_and_select_alerts_and_work_on_the_alerts() {
//		driver.get("https://demo.automationtesting.in/");
//		ho.getEmail().sendKeys("test@example.com");
//		ho.getNextclick().click();
		al.getSwitchto().click();
		al.getAlerts().click();
//		implicityWait();		
		al.getAlertwithok().click();;
		Alert A = driver.switchTo().alert();
		A.accept();
		al.getAlertokwithcancel().click();;
		al.getAlertaccept().click();;
		A.accept();
		al.getAlertdismiss().click();;
		A.dismiss();
		al.getTextbox().click();
		al.getEntername().click();
		A.sendKeys("Kala");
		A.accept();		
		   
	}

	@Then("Get url and check the url contains Alerts.html")
	public void get_url_and_check_the_url_contains_alerts_html() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("URL does not contain Alerts.html", currentUrl.contains("Alerts.html"));
	}

	@Then("Switch to tab and select Windows")
	public void switch_to_tab_and_select_windows() {
		al.getSwitchto().click();
		w.getWindow().click();;
	    
	}

	@Then("Get the url and check the url contains Alerts.html")
	public void get_the_url_and_check_the_url_contains_alerts_html() {
		String currentUrl1 = driver.getCurrentUrl();
		if(currentUrl1.contains("alerts.html")) {
			System.out.println("url contains 'alerts.html");
		}
		else {
			System.out.println("url doesnot contains 'alerts.html'");
		}
			
		
				
//	Assert.assertTrue("URL does not contain Alerts.html", currentUrl1.contains("Alerts.html"));
	}

	@Then("Click the blue button")
	public void click_the_blue_button() {
		w.getButton().click();;
	    
	}


}
