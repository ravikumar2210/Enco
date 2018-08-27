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
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import library.Utility;
import library.highLight;

@Listeners(utilityListeners.TestNGListeners.class)
public class RapidED_Report_ByFP extends wait {

	@Test
	public void TCForFP() throws Exception {
		// TODO Auto-generated method stub

		// set driver path

		// System.setProperty("webdriver.ie.driver","C:\\Users\\ue\\Downloads\\Fileupload\\IE_Setup\\IEDriverServer.exe");

		// Initialise browser

		// WebDriver driver=new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		wait wt = new wait();

		driver.get("http://ms-qa-c/EDrapid-sh-qa-c-20/Modules/RapidModulesHome.aspx");

		driver.manage().window().maximize();

		wt.implicitewait();

		// SoftAssert softAssert = new SoftAssert();

		// String bodyText =
		// driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_LastUpdated']")).getText();
		// Assert.assertTrue("Text not found!", bodyText.contains("RAPID Datamart last
		// updated on 8/31/2017 10:03:43 AM"));

		driver.navigate()
				.to("http://ms-qa-c/EDrapid-sh-qa-c-20/Modules/RapidModulesDefault.aspx?NavKey=565&OwnerType=1");

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView_ModuleList_cell0_1_ViewName']")).click();

		wt.implicitewait();

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_PeriodList']/option[2]")).click();

		wt.implicitewait();

		driver.findElement(By.xpath(
				"//*[@id='ctl00_ctl00_ContentBody_ModulesBody_MissingValuesSelector_MissingValuesSelector_expandoPanel']/div/label[3]")).click();

		wt.implicitewait();

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_PeriodDropDown']/option[9]")).click();

		// Utility.captureScreenshot(driver, "Default Test 1");

		wt.implicitewait();

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ReportDateType_DateSelector']/option[2]")).click();

		Utility.captureScreenshot(driver, "DataSet Filter Selection for ByFP");

		wt.implicitewait();

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_Button1']")).click();

		wt.implicitewait();

		Utility.captureScreenshot(driver, "Default Report Result");

		// Create action class object
		Actions builder = new Actions(driver);

		// find the tooltip xpath
		WebElement ele = driver.findElement(
				By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_tccell0_0']/a/span"));

		// Mouse hover to that text message
		builder.moveToElement(ele).perform();

		// Extract text from tooltip
		String tooltip_msg = ele.getText();

		// Print the tooltip message just for our refrences
		System.out.println("Tooltip/ Help message is " + tooltip_msg);

		// Arrange Throughput Time

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col2']/table/tbody/tr/td")).click();

		Thread.sleep(2000);

		boolean present;

		try {

			WebElement ThroughputTime = driver.findElement(
					By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col2']/table/tbody/tr/td"));

			present = true;
			highLight.highLightElement(driver, ThroughputTime);
			Thread.sleep(5000);

			Utility.captureScreenshot(driver, "ThroughputTime_ASCE for ByFP");

		}

		catch (NoSuchElementException e) {
			present = false;
		}

		//
		// wt.implicitewait();

		// driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col46']/table/tbody/tr/td[1]")).click();
		//
		// wt.implicitewait();
		//
		// Utility.captureScreenshot(driver, "Arrival To Triage_DESC");

		// Implementing Drag and Drop functionality

		WebElement From = driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col44']/table/tbody/tr/td"));

		WebElement To = driver
				.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_grouppanel']"));

		Actions builder1 = new Actions(driver);

		Action dragAndDrop = builder1.clickAndHold(From)

				.moveToElement(To)

				.release(To)

				.build();

		dragAndDrop.perform();

		Thread.sleep(4000);

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_gearWheelImg']")).click();

		wt.implicitewait();

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_lnkExport']")).click();

		wt.implicitewait();

		driver.findElement(By.xpath(
				"//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_txtMemo_I']")).sendKeys("Test ThroughputTime");

		wt.implicitewait();

		driver.findElement(By.xpath(
				".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_btnExcelExport']")).click();
		Thread.sleep(20000);

		driver.close();
	}

}
