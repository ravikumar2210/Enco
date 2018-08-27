package com.encor.Pages.helper.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class TestBase {
	private static final Logger logger = Logger.getLogger(TestBase.class.getName());
	
	@BeforeTest
	public void loadlog4J(){
		String log4jConfPath = System.getProperty("user.dir")+"\\src\\com\\encor\\Pages\\helper\\logger\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

}
