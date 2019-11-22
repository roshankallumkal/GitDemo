package com.usxs.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.usxs.base.TestBase;
import com.usxs.utilities.Testutil;

public class Login extends TestBase {
	
	
	
	@Test(dataProviderClass=Testutil.class,dataProvider="dp")
	public void login_as_super_admin(String username,String password) throws InterruptedException{
		
		
		System.out.println("gitdemo x");
		System.out.println("gitdemo xX");
		
		//Assert Title USXS 2.0 
		Assert.assertTrue(IsElementPresent(By.xpath(Obj_repo.getProperty("pagetitle"))),"Login page is not loaded");
		log.debug("Inside log in module");
		//Find and provide value for 'Email' field
		driver.findElement(By.xpath(Obj_repo.getProperty("emailBtn"))).sendKeys(username);
		//Find and provide value for 'Password' field
		driver.findElement(By.xpath(Obj_repo.getProperty("pwdBtn"))).sendKeys(password);
		//Find and click 'Login button'
		driver.findElement(By.xpath(Obj_repo.getProperty("loginBtn"))).click();
		Assert.assertTrue(IsElementPresent(By.xpath(Obj_repo.getProperty("userImg"))),"Home page is not loaded");
		//this.ClickHiddenElement(By.xpath("//*[@id=\"wrapper\"]/nav/ul[3]/li[3]/a/i"));
	   	Reporter.log("Logged  in successfully");
	   	//Reporter.log("<a href=\"E:\\SeleniumSS\\error.jpg\">Screenshot</a>");
	    
		//Thread.sleep(3000);
	   //	
	}
	
	

}
