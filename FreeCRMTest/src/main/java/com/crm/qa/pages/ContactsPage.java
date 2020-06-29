package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(id = "first_name")
	WebElement firstname;
	
	@FindBy(id = "middle_initial")
	WebElement middlename;
	
	@FindBy(id = "surname")
	WebElement lastname;
	
	@FindBy(xpath = "(//input[@type='submit' and @value='Save'])[2]")
	WebElement saveButton;
	
	//Intializing the page objects
	public ContactsPage() throws IOException{
	PageFactory.initElements(driver, this);	
	}
	
	public boolean verifyContactsLable() {
		return contactsLabel.isDisplayed();	
	}
	
	public void selectContacts(String contact) throws InterruptedException {
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath  =   "]/td[1]/input";
		
				for(int i=4; i<=7; i++){

				String name = driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();   
				    System.out.println(name);

				if(name.contains(contact)){

				driver.findElement(By.xpath(before_xpath+ i +after_xpath)).click();
				Thread.sleep(5000);
				
				}
				
	      }
							
	}
	
   public void createNewContact(String title,String ftname,String midname,String ltname){
	   Select select = new Select(driver.findElement(By.name("title")));
	    select.selectByVisibleText(title);
	    
	    firstname.sendKeys(ftname);
	    middlename.sendKeys(midname);
	    lastname.sendKeys(ltname); 
	    saveButton.click();
	    
   }
    
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			

	


