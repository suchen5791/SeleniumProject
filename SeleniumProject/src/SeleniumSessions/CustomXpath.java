package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca");
		
		//driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("drones");
		
		//driver.findElement(By.xpath("//input[@name = 'field-keywords']")).sendKeys("dog");
		
		//if you use contains in xpath then dont use = sign
		//driver.findElement(By.xpath("//input[contains(@class, 'nav-input')]")).sendKeys("cat");
		
		//Why use contains? ---> Dynamic id
		//id = test_123
		//id = test_456 -- session end and new session
		//id = test_789 -- closed the browser and logged in again
		//driver.findElement(By.xpath("input[contains(@id,'test_')]")).sendKeys("Test");
		
		//id = test_123
		//id = test_456 -- session end and new session
		//id = test_789 -- closed the browser and logged in again
		//starts-with  selenium Method : better in handling dynamic id's 
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
		
		//id = 123_test_t
		//id = 456_test_t -- session end and new session
		//id = 789_test_t -- closed the browser and logged in again
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
		
		//links
		driver.findElement(By.xpath("//a[contains(text(),'Registry')]")).click();
		
		
		
		
		

	}

}
