package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory - OR:

	@FindBy(xpath = "//*[contains(@class,'lazyloaded')]")
	WebElement MSLogo;

	@FindBy(id = "CustomerEmail")
	WebElement emailTextbox;

	@FindBy(id = "CustomerPassword")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"customer_login\"]/div/p[2]/button")
	WebElement signInBtn;

	// Verify Menu Bar
	@FindBy(xpath = "//*[@id=\"SiteNav\"]/li[1]/a/span")
	WebElement homeMenu;

	@FindBy(xpath = "//*[@id=\"SiteNav\"]/li[2]/a/span")
	WebElement aboutMenu;

	@FindBy(xpath = "//*[@id=\"SiteNav\"]/li[3]/a/span")
	WebElement productMenu;

	@FindBy(xpath = "//*[@id=\"SiteNav\"]/li[4]/a/span")
	WebElement customerServiceMenu;

	@FindBy(xpath = "//*[@id=\"SiteNav\"]/li[5]/a/span")
	WebElement blogMenu;

	@FindBy(id = "LoginHeading")
	WebElement loginTitle;

	@FindBy(id = "RecoverPassword")
	WebElement forgotPassword;

	@FindBy(id = "customer_register_link")
	WebElement createAccount;

	@FindBy(xpath = "//div[contains(@class,'footer_newsletter')]")
	WebElement newsLetter;

	@FindBy(xpath = "//div[contains(@class,'footer_about')]")
	WebElement learnMore;

	@FindBy(xpath = "//div[contains(@class,'footer_logo')]")
	WebElement footerLogo;

	// Footer Customer Services verify
	@FindBy(xpath = "//h3[contains(text(),Customer Service)]")
	WebElement customerServicesTitle;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[1]/ul/li[1]/a")
	WebElement contactUs;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a")
	WebElement shippingPolicies;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[1]/ul/li[3]/a")
	WebElement internationalOrder;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a")
	WebElement returnPolicy;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[1]/ul/li[2]/a")
	WebElement faQ;

	// Footer Information verify
	@FindBy(xpath = "//h3[contains(text(),Information)]")
	WebElement informationTitle;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[2]/ul/li[1]/a")
	WebElement aboutUs;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[2]/ul/li[2]/a")
	WebElement becomeaDealer;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[2]/ul/li[3]/a")
	WebElement affiliateProgram;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[2]/ul/li[4]/a")
	WebElement products;

	@FindBy(xpath = "/html/body/div[3]/div[2]/footer/div[2]/div/div/div[2]/div/div[2]/ul/li[5]/a")
	WebElement blog;

	// Footer Need help Section
	@FindBy(xpath = "//div[contains(@class,'site-footer__item-help')]")
	WebElement needHelp;

	@FindBy(xpath = "//div[contains(@class,'feedback-box')]")
	WebElement feedBackBox;

	// Initialization Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateMSLogo() {
		return MSLogo.isDisplayed();
	}

	public boolean validateMenu() {
		homeMenu.isDisplayed();
		aboutMenu.isDisplayed();
		productMenu.isDisplayed();
		customerServiceMenu.isDisplayed();
		return blogMenu.isDisplayed();

	}

	public boolean validateFooter() {
		newsLetter.isDisplayed();
		return learnMore.isDisplayed();

	}

	public boolean validetnewLetter() {
		newsLetter.isDisplayed();
		return learnMore.isDisplayed();
	}

	public boolean validateCustServices() {
		contactUs.isDisplayed();
		shippingPolicies.isDisplayed();
		internationalOrder.isDisplayed();
		returnPolicy.isDisplayed();
		return faQ.isDisplayed();
	}

	public boolean validateInformation() {
		aboutUs.isDisplayed();
		becomeaDealer.isDisplayed();
		affiliateProgram.isDisplayed();
		products.isDisplayed();
		return blog.isDisplayed();
	}

	public boolean validateNeedHelp() {
		needHelp.isDisplayed();
		return feedBackBox.isDisplayed();
	}

	public boolean validateLogout() {
		forgotPassword.isDisplayed();
		createAccount.isDisplayed();
		return loginTitle.isDisplayed();

	}

	public MyAccountPage login(String email, String pass) {
		emailTextbox.sendKeys(email);
		password.sendKeys(pass);
		signInBtn.click();

		return new MyAccountPage();
	}
}
