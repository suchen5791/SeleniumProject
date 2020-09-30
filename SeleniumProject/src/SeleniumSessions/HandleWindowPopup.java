package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[text() = 'Good PopUp #3']")).click();
		Thread.sleep(2000);
		
		Set<String> handler = driver.getWindowHandles();
		//set object name is handler -> has two Window ID's inside it (not based on indexes)
		//getWindowHandles gives Set<String>
		//to get values from set objects we use Iterator bcos it does not store value on basis of indexes
		
		Iterator<String> it = handler.iterator();
		
		//iterator pointing above the set object
		//shift iterator to point to set object--> use next() method
		String parentWindowId = it.next();
		System.out.println("parent window id:"+ parentWindowId);//will point to first id in the set object
		
		String childWindowId = it.next();
		System.out.println("child window id" + childWindowId );//will point to second id in the set object
		
		//switch to child window
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window popup title:" + driver.getTitle());//get the title of child window popup
		driver.close();//close the popup- dont use  quit() it will close both windows
		
		//switch to parent window
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window popup title" + driver.getTitle());//get the title of parent window popup
		driver.quit();
	}

}
