package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("proceed")).click();	    
	    Alert alert = driver.switchTo().alert();
	    
	    System.out.println(alert.getText());
	    
	    String text = alert.getText();
	    
	    if (text.equals("Please enter a valid user name")) {
		    System.out.println("Correct alert msg"); 
	    }
	    
	    else {
		    System.out.println("InCorrect alert msg"); 
	    }

	    alert.accept();
	    
	    driver.close();
	       
	}

}
