package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    //WebDriver driver = new ChromeDriver();
	    WebDriver driver = new HtmlUnitDriver();

	    driver.manage().window().maximize();
	    
	  //Dynamic Wait
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    driver.get("https://classic.crmpro.com/index.html");
	    
	    System.out.println("Before login title is "+driver.getTitle());
	    
	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("batchautomation");
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Test@12345");
	    
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Thread.sleep(3000);
	    
	    System.out.println("After login title is "+driver.getTitle());

	}

}
