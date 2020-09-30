package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//Global Waits----
		//Dynamic Wait----
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//if the page loads in say 2 sec then rest of 38 sec will be ignored - Dynamic wait
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// for all the webpage elements--> page is loaded buy some button is still not visible (ajax component) or broken images
		//after page is fully loaded wait for 30 sec to perform action on any webpage element
		//if dropdown state changes and city will take some time to update
		//if the page element in say 2 sec then rest of 28 sec will be ignored - Dynamic wait
		
		
	}

}
