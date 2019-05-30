package com.MS.qa.pages;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.MS.qa.base.TestBase;

public class ProductPage extends TestBase {

	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[1]/ul/li[1]/div/div[2]/div[4]/div[2]/form/a")
	WebElement firstshopnowbtn;

	@FindBy(xpath = "//*[@id=\"AddToCartText-product-template\"]")
	WebElement clickOnAddCartBtn;

	@FindBy(name = "note")
	WebElement instructorNote;

	@FindBy(xpath = "/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")
	WebElement checkOutBtn;

	@FindBy(xpath = "//button[contains(@class,'qtyplus')]")
	WebElement clickOnplusBtn;

	@FindBy(name = "updates[]")
	WebElement minqty;

	@FindBy(xpath = "/html/body/div[3]/main/div/div/form/div/div[2]/div/div[1]/span[2]/span")
	WebElement price;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public void clickOnShopNowBtn() {
		firstshopnowbtn.click();
	}

	public String validateProductTitle() {
		return driver.getTitle();
	}

	public void clickOnAddCartButton() {
		clickOnAddCartBtn.click();

	}

	public String validateCartPageTitle() {
		return driver.getTitle();
	}

	public void checkOutproduct(String note) throws InterruptedException {
		instructorNote.sendKeys(note);

		clickOnplusBtn.click();

		driver.findElement(By.xpath("//button[@name = 'checkout']")).submit();
		checkOutBtn.click();
	}

	public String validateContactInfoPageTitle() {
		return driver.getTitle();

	}

	public void Calculate() {
		for (int i = 1; i == 5; i++) {
			String qty = minqty.getAttribute("Value");
			System.out.println("DefaultQTY:-" + qty);
			clickOnplusBtn.click();
		}

	}
}
