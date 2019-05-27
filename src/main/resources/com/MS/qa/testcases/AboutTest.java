package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.AboutPage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;

public class AboutTest extends TestBase {
	AboutPage aboutpage;
	LoginPage loginpage;
	MyAccountPage myaccountpage;

	public AboutTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		aboutpage = new AboutPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		aboutpage = myaccountpage.clickOnAboutink();

	}

	@Test(priority = 1)
	public void validateAboutPageTitleTest() {
		Assert.assertEquals(aboutpage.validateTitle(), "About", "About Page Title not matched");

	}

	@Test(priority = 2)
	public void validateAboutPageSectionTest() {
		aboutpage.validatesSection();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
