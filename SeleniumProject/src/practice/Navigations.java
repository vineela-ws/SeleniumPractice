package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("http://www.google.com/");
	    
	    driver.navigate().to("https://www.amazon.com/");
	    
	    driver.navigate().back();
	    
	    Thread.sleep(3000);
	    
	    driver.navigate().forward();
	    
	    Thread.sleep(2000);
	    
	    driver.navigate().back();
	    
	    driver.close();

	}

}
