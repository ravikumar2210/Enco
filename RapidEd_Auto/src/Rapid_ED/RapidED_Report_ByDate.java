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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

import library.Utility;
import library.highLight;

@Listeners(utilityListeners.TestNGListeners.class)
public class RapidED_Report_ByDate extends wait {

	@Test
	public void TCForByDate() throws Exception {
		// TODO Auto-generated method stub

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

		// select "By Date" from drop down

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_PeriodList']/option[1]"))
				.click();

		wt.implicitewait();

		// select "Patients only with missing Values"

		driver.findElement(By.xpath(
				".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_MissingValuesSelector_MissingValuesSelector_expandoPanel']/div/label[3]")).click();

		wt.implicitewait();

		// Enter "From Date" value

		driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_InputFromDate']"))
				.sendKeys("3/15/2016");

		wt.implicitewait();

		// Enter " To Date "

		driver.findElement(By.xpath(".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ArrivalDates_InputToDate']"))
				.sendKeys("3/17/2016");

		Utility.captureScreenshot(driver, "DataSet Filter Selection For ByDate");

		wt.implicitewait();

		// Click on Go button

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_Button1']")).click();

		wt.implicitewait();

		Utility.captureScreenshot(driver, "Default Report Result for ByDate");

		Thread.sleep(5000);

		// Click on Report Filter

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_dxtcReport_T1T']")).click();

		wt.implicitewait();

		// Click on Departure Shift Filter

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_DepartureShiftSelect_selectorHeader']")).click();

		wt.implicitewait();

		// Click on Select All for Departure Shift Filter

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_DepartureShiftSelect_2A']")).click();

		wt.implicitewait();

		// Click on Morning Shift after Select All for Departure Shift Filter

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_DepartureShiftSelect_31']")).click();

		wt.implicitewait();

		// Click on Apply Filter

		driver.findElement(By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody__apply']")).click();

		Thread.sleep(5000);

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

		// Arranging Triage in Ascending order

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col39']/table/tbody/tr/td"))
				.click();

		Thread.sleep(2000);

		boolean present;

		try {

			WebElement Triage = driver.findElement(
					By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_col39']/table/tbody/tr/td"));

			present = true;
			highLight.highLightElement(driver, Triage);
			Thread.sleep(5000);

			Utility.captureScreenshot(driver, "Triage_ASCE for ByDate");

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

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_gearWheelImg']"))
				.click();

		wt.implicitewait();

		driver.findElement(
				By.xpath("//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_lnkExport']"))
				.click();

		wt.implicitewait();

		driver.findElement(By.xpath(
				"//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_txtMemo_I']"))
				.sendKeys("Test Triage");

		wt.implicitewait();

		driver.findElement(By.xpath(
				".//*[@id='ctl00_ctl00_ContentBody_ModulesBody_ASPxGridView1_Title_gearToolBar_exportPopUp_btnExcelExport']"))
				.click();

		Thread.sleep(20000);

		driver.close();
	}

}
