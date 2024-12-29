package Locator;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register {
public WebDriver driver;
	
	public Register(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

@FindBy(xpath = "//a[@href=\"Register.html\"]")
private WebElement register;

@FindBy(xpath = "//input[@placeholder=\"First Name\"]")
private WebElement firstname;

@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
private WebElement lastname;

@FindBy(xpath = "//textarea[@ng-model=\"Adress\"]")
private WebElement address;

@FindBy(xpath = "//input[@type=\"email\"]")
private WebElement email;

@FindBy(xpath = "//input[@type=\"tel\"]")
private WebElement phonenumber;

@FindBy(xpath = "//input[@value=\"FeMale\"]")
private WebElement female;

public void selectFemaleRadioButton() {
    if (!female.isSelected()) {
        female.click();
    }
}

public boolean isFemaleRadioButtonSelected() {
    return female.isSelected();
}

@FindBy(xpath = "//input[@type=\"checkbox\"]")
private List<WebElement> hobbiescheckbox;

public void clickHobbies(int index1, int index2) {
    hobbiescheckbox.get(index1).click();
    hobbiescheckbox.get(index2).click();
}

@FindBy(xpath = "//div[@id=\"msdd\"]")
private WebElement language;



@FindBy(xpath = "//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all\"]//li")
private List<WebElement> languagedropdown;



//@FindBy(xpath = "//ul[@style=\"list-style:none;max-height: 230px;overflow: scroll;\"]")
//private List<WebElement> languageOptions;

public boolean isLanguagedropdownDisplayed() {
	
	return language.isDisplayed();
}



public void selectLanguages(String language1, String language2) throws InterruptedException {
	    language.click();
	    	    
		for (WebElement option : languagedropdown) {
		if(option.getText().equals(language1)|| option.getText().equals(language2)) {
			option.click();
		}
		
	}
	
}




@FindBy(id = "Skills")
private WebElement skillsdropdown;

public void selectSkill(String skill) {
	Select select = new Select(skillsdropdown);
	select.selectByVisibleText(skill);
	
}

@FindBy(xpath = "//select[@type=\"text\"]")
private WebElement selectcountry;

public void country (String Country2) {
	Select s = new Select(selectcountry);
	s.selectByVisibleText(Country2);
}

@FindBy(xpath = "//span[@class=\"selection\"]")
private WebElement country;

@FindBy(xpath = "//input[@class=\"select2-search__field\"]")
private WebElement dropdowncheckbox;

@FindBy(xpath = "//span[@class=\"select2-results\"]")
private WebElement countrydropdown;

public void enterCountryinCheckbox(String Country){
	dropdowncheckbox.sendKeys(Country);
}

public WebElement getCountry() {
	return country;
}

public WebElement getDropdowncheckbox() {
	return dropdowncheckbox;
}

public WebElement getCountrydropdown() {
	return countrydropdown;
}

public void selectCountryfromDropdown(String Country) {
	Select sel = new Select(countrydropdown);
	sel.selectByVisibleText(Country);
}

public WebDriver getDriver() {
	return driver;
}





public WebElement getLanguage() {
	return language;
}

public List<WebElement> getLanguagedropdown() {
	return languagedropdown;
}

public WebElement getCountryDropdown() {
	return countryDropdown;
}

public List<WebElement> getCountryOptions() {
	return countryOptions;
}

@FindBy(xpath = "//span[@class=\"select2-results\"]")
private WebElement countryDropdown;

@FindBy(xpath = "//span[@class=\"select2-results\"]//a")
private List<WebElement> countryOptions;

public void selectDropdown(){
	countryDropdown.click();
	
}

public void selectCountry(String country) {
	for (WebElement option: countryOptions) {
		if(option.getText().equals(country)) {
			option.click();
			break;
		}
	}
}




@FindBy(xpath = "//select[@ng-init=\"yearbox=''\"]")
private WebElement yeardropdown; 

@FindBy(xpath = "//select[@ng-init=\"monthbox=''\"]")
private WebElement monthdropdown;

@FindBy(xpath = "//select[@ng-init=\"daybox=''\"]")
private WebElement daydropdown;

public void selectDOB(String day, String month, String year) {
    Select daySelect = new Select(daydropdown);
    daySelect.selectByVisibleText(day);

    Select monthSelect = new Select(monthdropdown);
    monthSelect.selectByVisibleText(month);

    Select yearSelect = new Select(yeardropdown);
    yearSelect.selectByVisibleText(year);
}


@FindBy(xpath = "//input[@id=\"firstpassword\"]")
private WebElement password;

@FindBy(xpath = "//input[@id=\"secondpassword\"]")
private WebElement secodpassword;

@FindBy(xpath = "//button[@id=\"submitbtn\"]")
private WebElement submit;

public WebElement getRegister() {
	return register;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPhonenumber() {
	return phonenumber;
}

public WebElement getFemale() {
	return female;
}


public List<WebElement> getHobbiescheckbox() {
	return hobbiescheckbox;
}



public WebElement getSkillsdropdown() {
	return skillsdropdown;
}



//public WebElement getCountrydropdown() {
//	return countrydropdown;
//}

public WebElement getYeardropdown() {
	return yeardropdown;
}

public WebElement getMonthdropdown() {
	return monthdropdown;
}

public WebElement getDaydropdown() {
	return daydropdown;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSecodpassword() {
	return secodpassword;
}

public WebElement getSubmit() {
	return submit;
}

public WebElement getPhoto() {
	return photo;
}

@FindBy(xpath = "//input[@type=\"file\"]")
private WebElement photo;

public void addphoto(String photopath) {
	photo.sendKeys(photopath);
	
}





}
