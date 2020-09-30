package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		//popup will get displayed and two screens displayed
		//1st get the text displayed on the popup
		//for this we need to swtich from background to popup screen
		
		Alert  alert = driver.switchTo().alert();
		//alert methode
		//now control has moved to alert box
		
		System.out.println(alert.getText());
		//print the text on the alert box using get text method
		
             String text = alert.getText();
             if(text.equals("Please enter a valid user name")) {
            	 System.out.println("correct alert message");
             }else {
            	 System.out.println("incorrect alert message");
             }
            	 
		
	   alert.accept();//clicks on ok button
	   //alert.dismiss();
		
		
		

	}

}
