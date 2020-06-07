package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
	    driver.manage().window().maximize();
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getPageSource());

	    
	    String title = driver.getTitle();
	    
	    if(title.equals("Google")) {
		    System.out.println("Correct title");	
	    }
	    else {
		    System.out.println("InCorrect title");	

	    }
	    
	    
	    driver.close();

	}

}
