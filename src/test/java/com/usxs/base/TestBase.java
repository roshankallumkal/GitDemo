package com.usxs.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.usxs.utilities.ExcelReader;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties Config;
	public static Properties Obj_repo=new Properties();
	public static FileInputStream fis;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testdata.xlsx");
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		if(driver==null) {
			Config = new Properties();
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			Config.load(fis);
			log.debug("Config file loaded");
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Obj_repo.properties");
			Obj_repo.load(fis);
			log.debug("Object repository file loaded");
		}
		
		
		 if(Config.getProperty("browser").equals("FireFox")){
			
			driver = new FirefoxDriver();
			
		}else if(Config.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome launched");
			
		} else if(Config.getProperty("browser").equals("IE")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else 
		{
			System.out.println("Something went wrong");
		}
			
	
		driver.get(Config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(Config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
	}
	
	// Check whether element is present in the web page
	
	public boolean IsElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		}catch(NoSuchElementException e){
			
			return false;			
		}
		
	}
	
	//Click hidden elements available in the web page
	
	public void ClickHiddenElement(By by) {
		try {
			WebElement eleedit = driver.findElement(by);
			JavascriptExecutor executoredit = (JavascriptExecutor)driver;
			executoredit.executeScript("arguments[0].click();", eleedit);	
			
			
		}catch(NoSuchElementException e){
			
					System.out.println(e);
					log.debug("Not able to locate Hidden element");
				
		}
		
		
		
	}
	
	// Select visible text from drop down field
	
	public void getDropdownValue (By by,String text) {
		try {
		
		WebElement dropdown = driver.findElement(by);
		Select dropd = new Select(dropdown);
		dropd.selectByVisibleText(text);
	} catch(NoSuchElementException e) {
		System.out.println(e);
		log.debug("Not able to locate dropdown");
	}
	}
	
	
	@AfterSuite
	public void teatDown() {
		driver.quit();
		
	}

}
