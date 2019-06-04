package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class AddNewAddressPage extends TestBase {

	// Page Factory

	@FindBy(xpath = "/html/body/div[3]/main/div[1]/header/h1")
	WebElement addressHeader;

	@FindBy(id = "AddressNewButton")
	WebElement addNewAddressBtn;

	@FindBy(id = "address_form_new")
	WebElement addNewAddressForm;

	@FindBy(id = "AddressFirstNameNew")
	WebElement firstName;

	@FindBy(id = "AddressLastNameNew")
	WebElement lastName;

	@FindBy(id = "AddressCompanyNew")
	WebElement companyName;

	@FindBy(id = "AddressAddress1New")
	WebElement addressTextBox;

	@FindBy(id = "AddressAddress2New")
	WebElement apartmentTextBox;

	@FindBy(id = "AddressCityNew")
	WebElement cityTextBox;

	@FindBy(id = "AddressZipNew")
	WebElement zipCodeTextbox;

	@FindBy(id = "AddressPhoneNew")
	WebElement phoneTextbox;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div/form/p/button")
	WebElement addAddressBtn;

	@FindBy(id = "AddressCountryNew")
	WebElement countryDropdown;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div/form/div[3]/div[2]/select/option[3]")
	WebElement selectIndia;

	@FindBy(id = "AddressProvinceNew")
	WebElement province;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/div/form/div[4]/select/option[12]")
	WebElement selectState;

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div/ul/li/div[1]/ul/li[2]/button")
	WebElement deleteBtn;

	public AddNewAddressPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateAddresspage() {
		return addressHeader.getText();
	}

	public void clickOnAddnewAddressBtn() {
		addNewAddressBtn.click();
	}

	public boolean validateNewAddressForm() {
		return addNewAddressForm.isDisplayed();
	}

	public void selectCountry() {
		countryDropdown.click();
		selectIndia.click();
	}

	public void fillAddressForm(String fNane, String lName, String cName, String address, String appartment,
			String cityName, String zipCode, String phone) {
		firstName.sendKeys(fNane);
		lastName.sendKeys(lName);
		companyName.sendKeys(cName);
		addressTextBox.sendKeys(address);
		apartmentTextBox.sendKeys(appartment);
		cityTextBox.sendKeys(cityName);
		countryDropdown.click();
		selectIndia.click();
		province.click();
		selectState.click();
		zipCodeTextbox.sendKeys(zipCode);
		phoneTextbox.sendKeys(phone);
		addAddressBtn.click();

	}

	public void validateDeleteBtn() {
		if (deleteBtn.isDisplayed()) {
			System.out.println("Address Sucessfully Added");
		} else {
			System.out.println("Address Not Successfully Added");
		}
	}
}
