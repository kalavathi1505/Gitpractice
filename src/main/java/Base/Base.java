package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

public static WebDriver driver;
	
	public static void BrowserLanuch() {
		driver = new ChromeDriver();
	}
		
	
	public static void maximise() {
		driver.manage().window().maximize();
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

	public void click(By locator) {
        driver.findElement(locator).click();
    }
	
	public boolean isIndexHtmlPresent() {
        return driver.getTitle().contains("index.html");
    }
	
	public static void screenshot(WebDriver driver,String imgName) throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File ImgType = screenshot.getScreenshotAs(OutputType.FILE);
		File ImgPath = new File("C:\\Users\\my pc\\eclipse-workspace\\Automationtesting\\Screenshot"+imgName+".png");
		FileUtils.copyFile(ImgType, ImgPath);
	}
	
	public static void quit() {
		
		driver.quit();
		
}
}