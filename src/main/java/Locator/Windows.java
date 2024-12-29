package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Windows {
	
public WebDriver driver;
	
	public Windows(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	

	@FindBy(xpath = "//a[@href=\"Windows.html\"]")
	private WebElement window;
	
	@FindBy(xpath ="//button[@class=\"btn btn-info\"]")
	private WebElement button;
	
	public WebElement getWindow() {
		return window;
	}

	public WebElement getButton() {
		return button;
	}


}
