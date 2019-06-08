package com.MS.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		Thread.sleep(3000L);
		checkOutBtn.click();
	}

	public String validateContactInfoPageTitle() {
		return driver.getTitle();

	}

	public void calculateQty() {

		// Calculate Qty

		String minqty = driver.findElement(By.name("updates[]")).getAttribute("value");
		int baseqty = Integer.parseInt(minqty); // MinQty Convert String to Integer

		String minprice = price.getText();
		String minprice1 = minprice.replace("$", "").replace(",", "");
		double price1 = Double.parseDouble(minprice1);

		for (int i = baseqty; i <= 5; i++) {

			String qty = driver.findElement(By.name("updates[]")).getAttribute("value"); // Qty
			Integer intqty = Integer.parseInt(qty); // Qty Convert into String to Integer

			System.out.println("=============== " + "TotalQty:-" + qty + " ==========================");

			String baseprice = price.getText();
			String newStr = baseprice.replace("$", "").replace(",", ""); // Remove $ and , sign

			double str1 = Double.parseDouble(newStr); // //Price Convert into String to Integer

			System.out.println("IntPrice:-" + newStr);
			System.out.println("Price:- " + baseprice);

			double p = (intqty * price1);
			System.out.println("Double value:-" + p);

			if (str1 == p) {
				System.out.println("Calculation Correct Working");
			} else {
				System.out.println("Calculation Correct not Working");
			}

			clickOnplusBtn.click();// Click on Plus icon
		}

	}

	// verify Checkout Page title
	public String verifyCheckoutPageTitle() {
		return driver.getTitle();
	}

}
