package Rapid_ED;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ExcelDataConfig;

public class TestDDT {

	ChromeDriver WebDriver;
// this will take data from dataprovider which we created
@Test(dataProvider="testdata")

public void TestFireFox(String uname,String password){
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
 WebDriver = new ChromeDriver();
wait wt = new wait();

// Maximize browser
WebDriver.manage().window().maximize();

// Load application
WebDriver.get("http://www.facebook.com");

// clear email field

WebDriver.findElement(By.id("email")).clear();

// Enter usename
WebDriver.findElement(By.id("email")).sendKeys(uname);

// Clear password field
WebDriver.findElement(By.id("pass")).clear();

// Enter password
WebDriver.findElement(By.id("pass")).sendKeys(password);
}

// this is DataProvider which actually feed data to our test cases here I have taken 2 D //array with 2 rows and 2 column it means. It will run our test case two times because we //have taken 2 rows. While first iteration this will pass username and password to test //case and in second iteration perform the same for second rows
@DataProvider(name="testdata")
public Object[][] TestDataFeed(){

	ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\ue\\eclipse-workspace\\RapidEd_Auto\\TestData\\Inputdata.xlsx");
// Create object array with 2 rows and 2 column- first parameter is row and second is //column
	int rows = config.getRowCount(0);

	Object[][] data= new Object [rows][2];

	for (int i = 0; i<rows;i++)
	{
		data[i][0] = config.getData(0,i,0);

		data[i][1] = config.getData(0,i,1);
		
	}
	return data;
	
	
	}
	@AfterTest
	public void QuitTC(){
	 
	// close browser after execution
	WebDriver.close();	

}
	
}

