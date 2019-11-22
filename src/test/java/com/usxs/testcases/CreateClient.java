package com.usxs.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.usxs.base.TestBase;
import com.usxs.utilities.Testutil;

public class CreateClient extends TestBase {
	
	@Test(dataProviderClass=Testutil.class,dataProvider="dp")
	
	public void createclient(String Name,String Email,String Phonecode,String Phone,String Description,String Address1,String Street,String City,String State,String Country) throws InterruptedException {
		
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("Actmn")));
		log.debug("Inside Create a client block");
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("ClntBtn")));
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("AddClnBtn")));
		
		
		
		driver.findElement(By.xpath(Obj_repo.getProperty("NameFld"))).sendKeys(Name);
		driver.findElement(By.xpath(Obj_repo.getProperty("EmailFld"))).sendKeys(Email);
		driver.findElement(By.xpath(Obj_repo.getProperty("Phncd"))).sendKeys(Phonecode);
		driver.findElement(By.xpath(Obj_repo.getProperty("PhNmFld"))).sendKeys(Phone);		
		driver.findElement(By.xpath(Obj_repo.getProperty("DescFld"))).sendKeys(Description);
		driver.findElement(By.xpath(Obj_repo.getProperty("AddFld"))).sendKeys(Address1);
		driver.findElement(By.xpath(Obj_repo.getProperty("StrFld"))).sendKeys(Street);
		driver.findElement(By.xpath(Obj_repo.getProperty("CityFld"))).sendKeys(City);
		driver.findElement(By.xpath(Obj_repo.getProperty("StateFld"))).sendKeys(State);
		this.getDropdownValue(By.xpath(Obj_repo.getProperty("CtryDrpdwn")), Country);		
		driver.findElement(By.xpath(Obj_repo.getProperty("ClntLogo"))).sendKeys("C:\\Users\\Roshan\\eclipse-workspace\\USXS_Data_Driven\\src\\test\\resources\\Images\\Clientlogo.jpg");
		driver.findElement(By.xpath(Obj_repo.getProperty("MobSplLogo"))).sendKeys("C:\\Users\\Roshan\\eclipse-workspace\\USXS_Data_Driven\\src\\test\\resources\\Images\\Mobilesplashlogo.jpg");
		driver.findElement(By.xpath(Obj_repo.getProperty("MobHdLogo"))).sendKeys("C:\\Users\\Roshan\\eclipse-workspace\\USXS_Data_Driven\\src\\test\\resources\\Images\\mobileHeaderLogo.jpg");
		
	
		
		
		this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("SaveBtn")));
		
		
		
		
		
	//	this.ClickHiddenElement(By.xpath(Obj_repo.getProperty("LogOut")));
		
	}
	
	

}
