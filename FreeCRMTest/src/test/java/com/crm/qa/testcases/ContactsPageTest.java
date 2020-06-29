package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	
	String sheetName = "sheetName";
	
	public ContactsPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setup() throws IOException {
		Intialization();
		 loginPage = new LoginPage();
		 testUtil = new TestUtil();
		 homePage = new HomePage();
		 contactsPage = new ContactsPage();
		 homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		 testUtil.switchToFrame();
	}
	
	@Test
	public void verifyContactsPageLable() throws IOException {
	 homePage.clickOnContactsLink();
     Assert.assertTrue(contactsPage.verifyContactsLable(),"Contacts label is missing in that page");		
	}
	
	@Test
	public void selectContactsTest() throws InterruptedException, IOException {
		homePage.clickOnContactsLink();
		contactsPage.selectContacts("00 Test1 Lname1");
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
		Object data [][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider = "getCRMTestData")
	public void validateCreateNewConatact(String title,String ftname,String midname,String ltname) 
			throws IOException, InterruptedException {
		homePage.clickOnNewContactsLink();;
		//contactsPage.createNewContact("Mr.","tom","peter","mn");
		contactsPage.createNewContact(title, ftname, midname, ltname);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
