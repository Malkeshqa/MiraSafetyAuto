package com.MS.qa.testcases;

import java.text.NumberFormat;
import java.text.ParseException;

import org.apache.poi.hwpf.usermodel.DropCapSpecifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.MS.qa.pages.ProductPage;

public class ProductPageNew extends TestBase {
	LoginPage loginpage;
	ProductPage productpage;
	MyAccountPage myaccountpage;

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium1\\MiraSafetyAuto\\browserdriver\\chromedriver74\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mirasafety.com/");
	}

	@Test
	public void checkoutProduct() throws InterruptedException, ParseException {
		driver.findElement(
				By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div[1]/div[1]/div/div[2]/a[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CustomerEmail")).sendKeys("demo001@mailinator.com");
		driver.findElement(By.id("CustomerPassword")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div/p[2]/button")).click();
		Assert.assertTrue(driver.findElement(By.id("customer_logout_link")).isDisplayed(), "Login Successfully");
		// Click on product Page
		driver.findElement(By.xpath("//*[@id=\"SiteNav\"]/li[3]")).click();
		String title = driver.findElement(By.className("mega-title")).getText();
		if (title.equals("PREMIUM PROTECTIVE TECHNOLOGY")) {
			System.out.println("Produc Page Displays");

			driver.findElement(By.xpath("//*[@id=\"product_form_1406910103603\"]/a")).click(); // Click on Shop Now
																								// Button
			driver.findElement(By.name("add")).click(); // Click on Add to Cart Button
			Thread.sleep(3000L);
			String price = driver
					.findElement(By.xpath(
							"//*[@id=\"shopify-section-cart-template\"]/div/form/div/div[2]/div/div[1]/span[2]/span"))
					.getText();
			driver.findElement(By.xpath("//*[@id=\"updates_large_12747930009651:4718a9050381ec7906c93ac53ade7357\"]"))
					.clear();
			driver.findElement(By.xpath("//*[@id=\"updates_large_12747930009651:4718a9050381ec7906c93ac53ade7357\"]"))
					.sendKeys("7");
			System.out.println("Price:-" + price);
			String newStr = price.replace("$", "").replace(", ", "");
			System.out.println("Price1:-" + newStr);

			driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button"))
					.isDisplayed();

			// Click on CheckOut Btn
			driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).click();
			Thread.sleep(3000L);
			Assert.assertEquals(driver.getTitle(), "Information - MIRA Safety - Checkout",
					"CheckOut Page not displays");
		} else {
			System.out.println("Product Page not displays");
		}
	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */

}
