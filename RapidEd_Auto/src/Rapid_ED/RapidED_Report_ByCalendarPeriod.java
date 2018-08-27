package Rapid_ED;


	import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

import library.Utility;
import library.highLight;


	@Listeners(utilityListeners.TestNGListeners.class)
	public class RapidED_Report_ByCalendarPeriod extends wait{
		
		@Test
		public void TCForByCalendar() throws Exception {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			wait wt = new wait();
			
			driver.get("http://c/rapid-sh-qa-c-20/Modules/RapidModulesHome.aspx");
			
			driver.manage().window().maximize();
			
			wt.implicitewait();
			
			
			
			//SoftAssert softAssert = new SoftAssert();
			
			//String bodyText = driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_LastUpdated']")).getText();
			//Assert.assertTrue("Text not found!", bodyText.contains("RAPID Datamart last updated on 8/31/2017 10:03:43 AM"));
			
			
			
			driver.navigate().to("http://ms-qa-c/EDrapid-sh-qa-c-20/Modules/RapidModulesDefault.aspx?NavKey=565&OwnerType=1");
			
			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView_ModuleList_cell0_1_ViewName']")).click();
			
			wt.implicitewait();
			
			// select "By Calendar Period" from drop down 			
			
			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_PeriodList']/option[3]")).click();

			wt.implicitewait();

			// select "Patients only with missing Values" 
			
			driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_MissingValuesSelector_MissingValuesSelector_expandoPanel']/div/label[3]")).click();

			wt.implicitewait();
			
			// Enter Previous year from Drop down

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_PeriodDropDown']/option[9]")).click();

			wt.implicitewait();
			
			// Select "ED service Date" from Drop down

			driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ReportDateType_DateSelector']/option[3]")).click();
		
			Utility.captureScreenshot(driver, "DataSet Filter Selection for ByCalendar Period");		  		

			wt.implicitewait();

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_Button1']")).click();
			
			wt.implicitewait();

			Utility.captureScreenshot(driver, "Default Report Result for ByCalendar Period");	
			

			 // Create action class object
			Actions builder=new Actions(driver);

			// find the tooltip xpath
			WebElement ele = driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_tccell0_0']/a/span"));

			// Mouse hover to that text message
			builder.moveToElement(ele).perform();

			// Extract text from tooltip
			 String tooltip_msg=ele.getText();

			// Print the tooltip message just for our refrences
			 System.out.println("Tooltip/ Help message is "+tooltip_msg);

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col38']/table/tbody/tr/td")).click();
			
			Thread.sleep(2000);
			

			
			boolean present;
			
			try {
				
				WebElement Depart= driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col38']/table/tbody/tr/td[1]"));
				  
				present = true;
				highLight.highLightElement(driver, Depart);
				Thread.sleep(5000);

				Utility.captureScreenshot(driver, "Depart_Departs for ByCalendar Period");
			   
			} 
			
			catch (NoSuchElementException e) {
			   present = false;
			}

				
//			
//			wt.implicitewait();
			
//			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col46']/table/tbody/tr/td[1]")).click();
//			
//			wt.implicitewait();
	//
//			Utility.captureScreenshot(driver, "Arrival To Triage_DESC");

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_gearWheelImg']")).click();

			wt.implicitewait();

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_lnkExport']")).click();

			wt.implicitewait();

			driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_txtMemo_I']")).sendKeys("Test Arrival");

			wt.implicitewait();

			driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_btnExcelExport']")).click();

			
			Thread.sleep(20000);
			
			driver.close();
		}

	}



