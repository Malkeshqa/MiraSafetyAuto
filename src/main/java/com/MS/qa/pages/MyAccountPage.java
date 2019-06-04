package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Order History (0)')]")
	WebElement orderHistoryTab;

	@FindBy(xpath = "//div[contains(@class,'myaccount__account-details')]")
	WebElement accountDetailsLabel;

	@FindBy(xpath = "//div[contains(@class,'myaccount__order-history')]")
	WebElement orderHistoryOption;

	@FindBy(id = "customer_logout_link")
	WebElement logoutbtn;

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[1]/a")
	WebElement homeLink;

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[2]")
	WebElement aboutLink;

	@FindBy(xpath = "//a[contains(@class,'btn--small')]")
	WebElement addnewAddressbtn;

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[1]/a")
	WebElement home;

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[3]")
	WebElement product;

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[4]")
	WebElement customerServices;

	@FindBy(xpath = "//a[contains(@class,'btn--small')]")
	WebElement viewAddressBtn;

	// Initialization the page Object
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyMyAccountPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogoutLink() {
		return logoutbtn.isDisplayed();
	}

	public boolean verifyOrderHistory() {
		return orderHistoryOption.isDisplayed();
	}

	public boolean accountDetails() {
		accountDetailsLabel.isDisplayed();
		return addnewAddressbtn.isDisplayed();
	}

	public HomePage clickOnHomeLink() {
		homeLink.click();
		return new HomePage();
	}

	public AboutPage clickOnAboutink() {
		aboutLink.click();
		return new AboutPage();

	}

	public AddNewAddressPage clickOnViewAddressBtn() {
		viewAddressBtn.click();
		return new AddNewAddressPage();
	}

	public ProductPage clickOnProductPage() {
		product.click();
		return new ProductPage();
	}

	public CustomerServicePage clickOnCustomerServiceLink() {
		customerServices.click();
		return new CustomerServicePage();
	}
}
