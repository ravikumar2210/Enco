package Rapid_ED;


	
	import java.io.File;
	import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
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
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;
	import org.testng.reporters.Files;

	import library.Utility;
	import library.highLight;
	
	public class Test_Bootstrap {


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

			driver.get("http://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

			driver.manage().window().maximize();

			wt.implicitewait();

			driver.findElement(By.xpath("//*[@id='autoclosable-btn-success']")).click();
			WebElement query = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div/div[2]/div[1]"));
			
			System.out.println(query.getText());
			
			driver.close();
		}

	}


}
