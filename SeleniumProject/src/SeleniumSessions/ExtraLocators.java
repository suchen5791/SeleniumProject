package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suche\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//driver.findElement(new ByAll (By.id("txtUsername"), By.name("txtUsername"),By.xpath("//input[@id = 'txtUsername']"))).sendKeys("Admin");
		
		//driver.findElement(new ByIdOrName("txtUsername")).sendKeys("Admin");
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		
		driver.findElement(new ByChained(By.id("fullname_field"), 
				By.id("u_4_a"),
				By.id("u_4_b"))).sendKeys("Admin");

	}

}
