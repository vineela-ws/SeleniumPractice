package keyboardandMouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vennela\\Desktop\\New Chrome\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();
		    driver.get("https://jqueryui.com/droppable/");
		    driver.manage().window().maximize();
		    
		    driver.switchTo().frame(0);
		    
		    Actions actions = new  Actions(driver);
		    
		    actions.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		    .moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();
		    
		    driver.close();
		   
	}

}
