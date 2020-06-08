package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    
	    //Dynamic Wait
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@type = 'text']")).sendKeys("watch");
	    
	   //For links CustomXpath
	    driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
   
	    //Dynamic Id
	    //id= test_123
	    //id = test_456
	    
	    driver.findElement(By.xpath("//*[contains(@id,test_")).sendKeys("test");
	    driver.findElement(By.xpath("//*[starts-with(@id,test_")).sendKeys("test");

	   //id= 1234_test
	   //id = 4567_test
	    
	    driver.findElement(By.xpath("//*[ends-with(@id,_test")).sendKeys("test");
	    
	    driver.close();
	}

}
