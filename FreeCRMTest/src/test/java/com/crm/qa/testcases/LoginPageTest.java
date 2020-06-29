package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		Intialization();
		 loginPage = new LoginPage();
	}
	
	@Test
	public void verifyLoginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test
	public void imageLogoTest() {
		boolean flag =loginPage.validateCRMLogo();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginTest() throws IOException {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
    public void tearDown() {
		driver.quit();
	}
}
