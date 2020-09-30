package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		// dont use .click
		//instead of .click() --> .sendkeys()

		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\suche\\Desktop\\Selenium\\Test folder\\test.txt");
		   
		
		
		
	
	}

}
