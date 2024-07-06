package com.qa.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	
	@Test
	public void method1() throws Exception {
		Reporter.log("Testcase ID= TC05");
		RemoteWebDriver driver=new ChromeDriver();
		Reporter.log("The browser is opened now.");
		
		driver.get(" http://dev-ec-web-admin.s3-website.ap-south-1.amazonaws.com");
		Thread.sleep(3000);
		Reporter.log("The application website is opened.");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("The browser is maximized.");
		
		driver.findElement(By.xpath("//a[text()='View Testimonials']")).click();
		Thread.sleep(3000);
		Reporter.log("Testimonial button has been clicked.");
		
		List<WebElement> l=driver.findElements(By.xpath("//*[contains(text(),'best School and Daycare')]"));
		Reporter.log("WebElements with text 'best School and Daycare' located.");
		
		Assert.assertTrue(l.size()>0);
		Reporter.log("Expected Result obtained");
		driver.quit();
		Reporter.log("The browser has been closed.");
	}

}
