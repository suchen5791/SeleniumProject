package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.ca");
		
		//1. get the total count of links on the page
		//all links are represented by <a> html tag:
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
				
		//size of Array list(linklist)
		System.out.println(linklist.size());
		
		//get total number of input fields
		// find number of inputs on the page
		List<WebElement> sput = driver.findElements(By.tagName("input"));
		System.out.println(sput.size());
		
		//2.get the text of all the links
		for (int i=0; i<linklist.size(); i++) {
			
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
			
		}

	}

}
