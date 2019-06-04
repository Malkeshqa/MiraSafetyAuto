package com.MS.qa.testcases;

public class Test {
	System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mirasafety.com/collections/frontpage/products/cm-7m-military-gas-mask");
	driver.findElement(By.xpath("//*[@id='AddToCartText-product-template']")).click();
	Thread.sleep(3000L);
	assert driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).isDisplayed();
	driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).sendKeys("test");
	System.out.println("text entered");
	Thread.sleep(3000L);
	assert driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).isDisplayed();
	driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).click();
}
