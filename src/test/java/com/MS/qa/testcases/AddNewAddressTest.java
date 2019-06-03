package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.AddNewAddressPage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;

public class AddNewAddressTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	AddNewAddressPage addnewaddresspage;

	public AddNewAddressTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		addnewaddresspage = new AddNewAddressPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		addnewaddresspage = myaccountpage.clickOnViewAddressBtn();

	}

	@Test(priority = 1)
	public void viewAddresspageTest() {
		Assert.assertEquals(addnewaddresspage.validateAddresspage(), "Your Addresses",
				"View Address Page not Displays");
	}

	@Test(priority = 2)
	public void verifyAddNewAddForm() {

		addnewaddresspage.clickOnAddnewAddressBtn();
		Assert.assertTrue(addnewaddresspage.validateNewAddressForm());
		addnewaddresspage.fillAddressForm("Alok", "jagadiya", "xyz", "Address", "B/6", "amd", "380051", "123456789");
		addnewaddresspage.validateDeleteBtn();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
