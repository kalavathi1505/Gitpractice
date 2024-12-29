package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

public WebDriver driver;
	
	public Home(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

		
	    @FindBy(xpath = "//input[@id=\"email\"]")
	    private WebElement email;
	 
	    @FindBy(xpath = "//img[@id=\"enterimg\"]")
	    private WebElement nextclick;
	    
	    @FindBy(xpath = "//button[@id=\"btn1\"]")
	    private WebElement SignInButton;
	    
	    @FindBy(xpath = "//button[@id=\"btn2\"]")
	    private WebElement skipSignInButton;
	    
	    @FindBy(xpath = "//a[@href=\"Index.html\"]")
	    private WebElement home;
	    
	    	    

	    public WebElement getEmail() {
			return email;
		}

		public WebElement getNextclick() {
			return nextclick;
		}

		public WebElement getHome() {
			return home;
		}

		public WebElement getSignInButton() {
			return SignInButton;
		}

		public WebElement getSkipSignInButton() {
			return skipSignInButton;
		}

		
}
