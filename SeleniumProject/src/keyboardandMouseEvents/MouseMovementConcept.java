package keyboardandMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    
	    Actions actions = new  Actions(driver);
	    actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();  
	    Thread.sleep(8000);
	    
	    driver.findElement(By.linkText("SpiceMax ")).click();
	    
	    driver.close();
	      
	}

}
