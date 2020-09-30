package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		
		//Explicitly wait for a specific element to load
		//Dynamic wait & Synchronization point
		
		//clickOn(driver, driver.findElement(By.xpath("//button[@type = 'submit']")), 20);//click login button
		clickOn(driver, driver.findElement(By.xpath("//a[text() = 'Create a Page']")), 15);//create a page link
		

	}
	
	//Custom Designed Explicitly Wait  static method which can be used in main method
	//this method can only be be used for click and can not be used for drop down
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		
	}

}
