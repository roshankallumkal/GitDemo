package com.usxs.notebook;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.usxs.utilities.MonitoringMail;
import com.usxs.utilities.TestConfig;

public class TestHostAdd {
	
	public static void main(String[] args) throws UnknownHostException, AddressException, MessagingException {
		MonitoringMail mail = new MonitoringMail();
		String messageBody = "http://"+InetAddress.getLocalHost().getHostAddress()+":8080/job/USXS_Data_Driven/USXS_20-_20HTML_20report/";
	    System.out.println(messageBody);
	    mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
	}

}
