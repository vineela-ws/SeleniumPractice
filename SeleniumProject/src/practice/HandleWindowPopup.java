package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.popuptest.com/goodpopups.html");
	    
	    driver.findElement(By.xpath("//a[(text()='Good PopUp #3')]")).click();
	    
	    Set<String> handler = driver.getWindowHandles();
	    
	    Iterator<String> it = handler.iterator();
	    
	    String parentwindowId = it.next();
	    
	    System.out.println("Parent window Id is :"+parentwindowId);
	    
        String childwindowId = it.next();
	    
	    System.out.println("child window Id is :"+childwindowId);
	    
	    driver.switchTo().window(childwindowId);
	    
	    Thread.sleep(2000);
	    
	    System.out.println("child window title is :" +driver.getTitle());
	    
	    driver.close();
	    
	    driver.switchTo().window(parentwindowId);
	    
	    Thread.sleep(2000);
	    
	    System.out.println("parent window title is :" +driver.getTitle());
	    
	    driver.quit();
	    
	}

}
