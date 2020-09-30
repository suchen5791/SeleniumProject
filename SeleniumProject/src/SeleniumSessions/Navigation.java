package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.amazon.ca/");
		
		//Back and Forward simulation
		
		driver.navigate().back();//google
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//amazon
		
		Thread.sleep(2000);

		driver.navigate().back();//google
		
		driver.navigate().refresh();
		
	}

}
