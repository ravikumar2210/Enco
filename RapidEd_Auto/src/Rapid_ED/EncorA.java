package Rapid_ED;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import library.Utility;
import library.highLight;

@Listeners(utilityListeners.TestNGListeners.class)
public class EncorA extends wait {

    WebDriver driver;			

	wait wt = new wait();
	
	@Test (priority=1)
	public void TCForED1A() throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");

		 driver = new ChromeDriver();

		driver.get("http://rkumar:M3d1s0lv@jul@c/encor-sh-qa-c-20/CoreMeasuresDefault.aspx");

		driver.manage().window().maximize();

		wt.implicitewait();

	
		driver.findElement(
				By.xpath(".//*[@id='ctl00_LinkIconAbstraction']/img")).click();

		wt.implicitewait();
		
		driver.findElement(
				By.xpath(".//*[@id='ctl00_ctl00_DefaultMasterBody_AbstractionPage_AbsMasterBody_QuarterDropDown_QuartersDropDownCtrl']/option[2]")).click();

		wt.implicitewait();
		
		
		driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_DefaultMasterBody_AbstractionPage_AbsMasterBody_ASPxGridView1_DXFREditorcol9_I']")).sendKeys("GLOBAL");

		Thread.sleep(5000);

		driver.findElement(
				By.xpath(".//*[@id='ctl00_ctl00_DefaultMasterBody_AbstractionPage_AbsMasterBody_ASPxGridView1_cell0_17_AbsImg']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(
				By.xpath(".//*[@id='EDPatient']/label[2]")).click();

		Thread.sleep(5000);
		
		
		String buttonColor = driver.findElement(By.xpath(".//*[@id='ctl00_DefaultMasterBody_ToolbarTabPage_ED1aResult']/span/span/span")).getCssValue("background-color");
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_DefaultMasterBody_ToolbarTabPage_ED1aResult']/span/span/span")).getCssValue("background-color"));
		
		Thread.sleep(5000);
		
		// Testing case for Not in Pop
		
		  Assert.assertEquals("rgba(255, 255, 0, 1)", buttonColor);
	   
		  System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_DefaultMasterBody_accountInfo1_AccountInfoTabPage_lblAccountNo']")).getText() + " Case is Not in Pop");
		  
		  Thread.sleep(5000);
	}
	
	@Test (priority=2)		
    public void CheckForInMeasurePop() throws Exception {	
		
		//ED Patient Yes
		driver.findElement(
				By.xpath(".//*[@id='EDPatient']/label[1]/input")).click();   
		
		wt.implicitewait();
		
		

    }	
	
	
	

}
