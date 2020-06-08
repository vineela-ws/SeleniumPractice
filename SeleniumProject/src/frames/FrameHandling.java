package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://classic.crmpro.com/index.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("batchautomation");
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Test@12345");
	    
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(3000);
	    
	    driver.switchTo().frame("mainpanel");
	    Thread.sleep(2000);

	    driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	    
	    driver.close();
	}

}
