package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.HomePage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myAccountpage;
	HomePage homepage;

	public MyAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		loginPage = new LoginPage();
		myAccountpage = loginPage.login(prop.getProperty("email"), prop.getProperty("pass"));

	}

	@Test(priority = 1)
	public void verifyMyAccountPageTitletest() {
		String myAccounttitle = myAccountpage.verifyMyAccountPageTitle();
		Assert.assertEquals(myAccounttitle, "Account", "MyAccount Page Title not Matched");
	}

	@Test(priority = 2)
	public void validateFooterTest() {
		boolean mainMenu = loginPage.validateMenu();
		boolean newsLetter = loginPage.validetnewLetter();
		boolean customer = loginPage.validateCustServices();
		boolean information = loginPage.validateInformation();
		boolean needHelp = loginPage.validateNeedHelp();
		boolean footer = loginPage.validateFooter();
		Assert.assertTrue(footer);
		Assert.assertTrue(mainMenu);
		Assert.assertTrue(newsLetter);
		Assert.assertTrue(customer);
		Assert.assertTrue(information);
		Assert.assertTrue(needHelp);
	}

	@Test(priority = 3)
	public void verifyLogoutLinkTest() {
		Assert.assertTrue(myAccountpage.verifyLogoutLink());
	}

	@Test(priority = 4)
	public void verifyOrderHistoryTest() {
		Assert.assertTrue(myAccountpage.verifyOrderHistory());
	}

	@Test(priority = 5)
	public void verifyAccountDetailsTest() {
		Assert.assertTrue(myAccountpage.accountDetails());
	}

	@Test(priority = 6)
	public void verifyContactsLinkTest() {
		homepage = myAccountpage.clickOnHomeLink();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
