package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.HomePage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MyAccountPage myaccountpage;

	// Create Constructor
	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		homepage = myaccountpage.clickOnHomeLink();

	}

	@Test(priority = 1)
	public void validateHomePageTitleTest() {
		Assert.assertEquals(homepage.validateHomePageTitle(), "MIRA Safety - Gas Masks & Personal Protective Equipment",
				"Home Page Title not Matched");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
