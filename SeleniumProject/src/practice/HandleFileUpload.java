package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("https://html.com/input-type-file/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@name='fileupload']")).sendKeys("C:\\Users\\Vennela\\Desktop\\common doc");

	}

}
