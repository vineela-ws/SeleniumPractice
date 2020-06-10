package frames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	 static  WebDriver driver;

	public static void main(String[] args) throws IOException {
				
     Properties prop = new Properties();
     
     FileInputStream ip = new FileInputStream("C:\\Users\\Vennela\\git\\SeleniumPractice\\SeleniumProject\\src\\frames\\config.properties");
     
     prop.load(ip);
     
     System.out.println(prop.getProperty("name"));
     System.out.println(prop.getProperty("age"));
     
     String url = prop.getProperty("url");
     
     System.out.println(url);
     
     String browserName = prop.getProperty("browser");
     
     System.out.println(browserName);
     
     if(browserName.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");
         driver = new ChromeDriver();
     } 
     
     driver.get(url);
     
     driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstname"));
     driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastname"));  
	}

}
