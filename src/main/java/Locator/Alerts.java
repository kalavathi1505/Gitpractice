package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alerts {

public WebDriver driver;
	
	public Alerts(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

//	@FindB^ 

	@FindBy(xpath = "//a[@href=\"SwitchTo.html\"]")
    private WebElement switchto;
    
    @FindBy(xpath = "//a[@href=\"Alerts.html\"]")
    private WebElement alerts;
    
    @FindBy(xpath = "//button[@class=\"btn btn-danger\"]")
    private WebElement alertwithok;
    
    @FindBy(xpath = "//a[.='Alert with OK & Cancel ']")
    private WebElement alertokwithcancel;
    
    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    private WebElement alertaccept;
    
    public WebElement getAlertokwithcancel() {
		return alertokwithcancel;
	}



	@FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    private WebElement alertdismiss;
    
    @FindBy(xpath = "//a[.='Alert with Textbox ']")
    private WebElement textbox;
    
    @FindBy(xpath = "//button[@class=\"btn btn-info\"]")
    private WebElement entername;
   

    public WebElement getSwitchto() {
		return switchto;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getAlertwithok() {
		return alertwithok;
	}

	public WebElement getAlertaccept() {
		return alertaccept;
	}

	public WebElement getAlertdismiss() {
		return alertdismiss;
	}

	public WebElement getTextbox() {
		return textbox;
	}

	public WebElement getEntername() {
		return entername;
	}
    
    
	
	
}
