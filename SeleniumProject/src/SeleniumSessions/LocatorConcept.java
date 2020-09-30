package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\suche\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//1. xpath: ---2
		//absolute xpath  should not be used -- /html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/div/a
		//only relative xpath should be used -- //*[@id='firstname']
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Jai");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Nigam");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();

		//2. id:---1
		driver.findElement(By.id("txtUsername")).sendKeys("Jai");
		driver.findElement(By.id("txtPassword")).sendKeys("nigam");
		
		//3. name: ---3
		driver.findElement(By.name("txtUsername")).sendKeys("Jai");
		driver.findElement(By.name("txtPassword")).sendKeys("nigam");
		
		//4. link text: only for links ---1
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//5. partial link text: not useful
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//6. css selector: ---2
	    driver.findElement(By.cssSelector("#btnLogin")).click();
	    
	    //7. class name: not useful  ---4
	    driver.findElement(By.className("")).click();
	}

}
