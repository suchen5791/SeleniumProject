package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMovements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text() = \"Add-Ons\"]"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text() = \"Hot Meals \"]")).click();
		
		
		driver.quit();
		
		
		

	}

}
