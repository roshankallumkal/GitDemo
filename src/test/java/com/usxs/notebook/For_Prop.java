package com.usxs.notebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class For_Prop {
	
	public static void main(String[] args) throws IOException {
		
		Properties Config=new Properties();
		Properties Obj_repo=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		Config.load(fis);
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Obj_repo.properties");
		Obj_repo.load(fis);
		System.out.println(Config.getProperty("browser"));
		System.out.println(Obj_repo.getProperty("emailBtn"));
				}

}
