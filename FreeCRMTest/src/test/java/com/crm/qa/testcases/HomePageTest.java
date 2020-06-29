package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;
	

	public HomePageTest() throws IOException {
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
	}
	
	@Test
	public void VerifyHomePageTitleTest() {
		String title = homePage.verifyPageTitle();
		Assert.assertEquals(title, "CRMPRO","HomePage Title Not Matched");
	}
	
	@Test
	public void verifyUserNameTest() {
		testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
		
	}
	
	@Test
	public void verifyContactsLinkTest() throws IOException {
		testUtil.switchToFrame();;
		contactsPage = homePage.clickOnContactsLink();
	}
	
	@AfterMethod
    public void tearDown() {
		driver.quit();
	}

}
