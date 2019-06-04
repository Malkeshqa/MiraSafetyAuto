package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class CustomerServicePage extends TestBase {

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[1]/ul/li[1]")
	WebElement contactUs;

	@FindBy(xpath = "/html/body/div[3]/main/div[1]/div/div/div/div/h2")
	WebElement header;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h2")
	WebElement contactUsHeader;

	@FindBy(xpath = "//a[contains(text(),'Shipping')]")
	WebElement shipping;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement shippingHeader;

	@FindBy(xpath = "//a[contains(text(),'International Shipping')]")
	WebElement internationShipping;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement internationShippingHeader;

	@FindBy(xpath = "//a[contains(text(),'Returns')]")
	WebElement returns;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement returnsHeader;

	@FindBy(xpath = "//a[contains(text(),'Warranty Claims')]")
	WebElement warrantyClaims;

	@FindBy(xpath = "//*[@id=\"MainContent\"]/div[2]/div/div/div[2]/div[1]/h2")
	WebElement warrantyClaimsHeader;

	@FindBy(xpath = "//a[contains(text(),'Warranty Registration')]")
	WebElement warrantyRegistration;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement warrantyRegistrationHeader;

	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement faq;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h2")
	WebElement faqHeader;

	@FindBy(xpath = "//a[contains(text(),'Military Discount')]")
	WebElement militaryDiscount;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement militaryDiscountHeader;

	@FindBy(xpath = "//a[contains(text(),'Terms of Use')]")
	WebElement termsOfUse;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement termsOfUseHeader;

	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	WebElement privacyPolicy;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div[2]/div[1]/h1")
	WebElement privacyPolicyHeader;

	public CustomerServicePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateCustomerServiceTitle() {
		return driver.getTitle();
	}

	public void validateHeader() {
		String CustomerService = header.getText();
		if (CustomerService.equals("Customer Service")) {
			System.out.println("Customer Services header displays");
		} else {
			System.out.println("Customer Services header not displays");
		}
	}

	public boolean validateContactUs() {
		return contactUs.isDisplayed();
	}

	public String validateContactUstitle() {
		String contactUs = contactUsHeader.getText();
		return contactUs;
	}

	public void clickOnShipping() {
		shipping.click();
	}

	public String validateShippingTitle() {
		String shippingTitle = shippingHeader.getText();
		return shippingTitle;
	}

	public void clickOnInternationShipping() {
		internationShipping.click();
	}

	public String validateInternationShippingTitle() {
		String internationalShippingTitle = internationShippingHeader.getText();
		return internationalShippingTitle;
	}

	public void clickOnReturns() {
		returns.click();
	}

	public String validateReturnsTitle() {
		String returnsTitle = returnsHeader.getText();
		return returnsTitle;
	}

	public void clickOnWarrantyClaims() {
		warrantyClaims.click();
	}

	public String validateWarrantyClaimsTitle() {
		String warrantyClaimssTitle = warrantyClaimsHeader.getText();
		return warrantyClaimssTitle;
	}

	public void clickOnwarrantyRegistration() {
		warrantyRegistration.click();
	}

	public String validatewarrantyRegistrationTitle() {
		String warrantyRegistrationTitle = warrantyRegistrationHeader.getText();
		return warrantyRegistrationTitle;
	}

	public void clickOnfaq() {
		faq.click();
	}

	public String validateFaqTitle() {
		String faqTitle = faqHeader.getText();
		return faqTitle;
	}

	public void clickOnMilitaryDiscount() {
		militaryDiscount.click();
	}

	public String validateMilitaryDiscountTitle() {
		String militaryDiscountTitle = militaryDiscountHeader.getText();
		return militaryDiscountTitle;
	}

	public void clickOnTermsOfUse() {
		termsOfUse.click();
	}

	public String validatetermsOfUseTitle() {
		String termsOfUseTitle = termsOfUseHeader.getText();
		return termsOfUseTitle;
	}

	public void clickOnPrivacyPolicy() {
		privacyPolicy.click();
	}

	public String validateprivacyPolicyTitle() {
		String privacyPolicyTitle = privacyPolicyHeader.getText();
		return privacyPolicyTitle;
	}

}
