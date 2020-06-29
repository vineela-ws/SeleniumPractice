package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//td[contains(text(),'User: Demo User ')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//Intializing the page objects
		public HomePage() throws IOException{
			PageFactory.initElements(driver, this);	
		}
		
	public String verifyPageTitle(){
		return driver.getTitle();	
	}
	
	public boolean  verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() throws IOException {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDealsLink() throws IOException {
		dealsLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() throws IOException {
		tasksLink.click();
		return new TasksPage();
	}
	
	public void clickOnNewContactsLink() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		Thread.sleep(5000);
		newContactsLink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
