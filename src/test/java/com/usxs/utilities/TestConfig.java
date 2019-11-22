package com.usxs.utilities;
public class TestConfig{


	
	public static String server="smtp.gmail.com";
	public static String from = "seleniumtestreport2019@gmail.com";
	public static String password = "insight@2019";
	public static String[] to ={"roshantom@gmail.com","roshan@eglobeits.com"};
	public static String subject = "Automation Test Status - USXS sanity scenarios";
	
	public static String messageBody ="Hi all,\n Test execution has been completed sucessfully.Please click the following link to view test report";
	public static String attachmentPath="c:\\screenshot\\2017_10_3_14_49_9.jpg";
	public static String attachmentName="error.jpg";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/acs";
	
	
	
	
	
	
	
	
	
}
