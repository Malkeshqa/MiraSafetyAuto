package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myAccountPage;

	// Create Constructor
	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Account");
	}

	@Test(priority = 2)
	public void MSLogoTest() {
		boolean flg = loginPage.validateMSLogo();
		Assert.assertTrue(flg);
	}

	@Test(priority = 3)
	public void validateMenuTest() {
		boolean menu = loginPage.validateMenu();
		Assert.assertTrue(menu);
	}

	@Test(priority = 4)
	public void validateLogOutTest() {
		boolean logOut = loginPage.validateLogout();
		Assert.assertTrue(logOut);
	}

	@Test(priority = 5)
	public void validateNewsLetterTest() {
		boolean news = loginPage.validetnewLetter();
		Assert.assertTrue(news);
	}

	@Test(priority = 6)
	public void validatecustomerServicesTest() {
		boolean cust = loginPage.validateCustServices();
		Assert.assertTrue(cust);
	}

	@Test(priority = 7)
	public void validateInformationTest() {
		boolean info = loginPage.validateInformation();
		Assert.assertTrue(info);
	}

	@Test(priority = 8)
	public void loginTest() {
		myAccountPage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
