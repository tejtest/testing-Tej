package com.qa.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void method1() throws Exception {
		Reporter.log("Testcase ID= TC03");
		RemoteWebDriver driver= new ChromeDriver();
		Reporter.log("The browser is opened now.");
		driver.get("http://dev-ec-web-admin.s3-website.ap-south-1.amazonaws.com");
		Thread.sleep(3000);
		Reporter.log("The application website is opened.");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("The browser is maximized.");
		driver.findElement(By.xpath("//a[@class='readTitle'][text()='Contact']")).click();
		Thread.sleep(3000);
		Reporter.log("Contact Tab at the top of the page has been clicked.");
		driver.findElement(By.xpath("//a[@href='/enroll-now']")).click();
		Thread.sleep(3000);
		Reporter.log("Enroll Now Button has been clicked.");
		String ExpectedTitle ="Enroll-Now | Educase Global School";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		Reporter.log("Expected Result obtained");
		driver.quit();
		Reporter.log("The browser has been closed.");
		
	}

}
