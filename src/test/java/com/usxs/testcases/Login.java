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
		
		
		System.out.println("check subbranch");		
		//Assert Title USXS 2.0 
		
	   	//Reporter.log("<a href=\"E:\\SeleniumSS\\error.jpg\">Screenshot</a>");
	    
		//Thread.sleep(3000);
	   //	
	}
	
	@Test
	public void subbranchsetup() {
		System.out.println("Code added for sub branch cases");
		System.out.println("Again changes made to develop branch in gitx");
	}
	

}
