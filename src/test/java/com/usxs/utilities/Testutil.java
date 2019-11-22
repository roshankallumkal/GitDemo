package com.usxs.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.usxs.base.TestBase;





public class Testutil extends TestBase{
	
	public static String Screenshotpath;
	public static String Screenshotname;
	public static void captureScreenshot() throws IOException {
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//System.out.println("Screenshot taken");
		
		Date d =new Date();
		Screenshotname= d.toString().replace(":", "_").replace(" ", "_")+".jpeg";
				System.out.println(Screenshotname);
		
		//Screenshotname="error.jpg";
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Roshan\\eclipse-workspace\\USXS_Data_Driven\\target\\surefire-reports\\html\\"+Screenshotname));
	}
	
	@DataProvider(name="dp")
	public Object[][] getData(Method m){
		
		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][cols];
		
		for(int rowNum=2;rowNum<=rows;rowNum++) {
			for(int colNum=0;colNum<cols;colNum++) {
				
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
			
		
		return data;
		
	} 
	
}