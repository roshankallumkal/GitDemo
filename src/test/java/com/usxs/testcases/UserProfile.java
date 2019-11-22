package com.usxs.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.usxs.base.TestBase;


public class UserProfile extends TestBase{
	
	@Test
	public void userprofile() throws InterruptedException {
		
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("Usrprf")));
		Assert.assertTrue(IsElementPresent(By.xpath(Obj_repo.getProperty("UsrprfLbl"))),"Profile page is not loaded");
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("CanBtn")));
		//driver.findElement(By.xpath(Obj_repo.getProperty("CanBtn"))).click();
		
		
		
		log.debug("in user profile page");
		
		Thread.sleep(3000);
	}
	

}
