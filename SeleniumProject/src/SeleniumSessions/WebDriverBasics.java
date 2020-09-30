package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	public static void main(String[] args) {
		
			
		//1.Chrome browser:
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//chrome driver implementing webdriver interface
		
		driver.get("http://www.google.com");//entering the url
		
		 String title = driver.getTitle();//return type is string
		 
		 System.out.println(title);
		 
		 //validation point: 
		 if(title.equals("Google")) {
			 System.out.println("correct title");
		 }else {
			 System.out.println("in correct title");
		 }
		 
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getClass());
		 System.out.println(driver.getWindowHandles());
		
		 driver.quit();
	}

}
