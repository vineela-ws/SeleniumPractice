package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    driver.manage().window().maximize();
	    
	    //Dynamic Wait
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	    
	    //Get the Total count of links
	    //Get the text of each link
	    
	    //all the links are represented by <a> html tag
	    
	    List<WebElement> linkedList = driver.findElements(By.tagName("a"));
	    
	    //Size of linkList
	    
	    System.out.println(linkedList.size());
	    
	    for(int i =0; i<linkedList.size(); i++) {
	    	
	    	String linksText = linkedList.get(i).getText();
	    	
	    	System.out.println(linksText);
	    	  	
	    }
	    
	}

}
