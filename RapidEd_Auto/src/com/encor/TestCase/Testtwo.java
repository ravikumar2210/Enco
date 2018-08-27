package com.encor.TestCase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.encor.Pages.abstractionPage;
import com.encor.Pages.helper.wait.waitHelper;

public class Testtwo {

	@Test
	public void verifyValidLogin() throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://rkumar:M3d1s0lv@jul@c/encor-sh-qa-c-20/CoreMeasuresDefault.aspx");

		abstractionPage abs = new abstractionPage(driver);

		waitHelper waite = new waitHelper(driver);

		abs.AbsIconClick();

		abs.AbsFirstCaseClick();

		abs.TransferFromAnotherHospitalorASCYes();

		abs.ClickOnSaveButton();

		abs.ClickOnSaveContinue();

		waite.setImplicitWait(3000, TimeUnit.MILLISECONDS);
		
		String color = abs.GetMeasueStatusButtonColor();

		Assert.assertEquals(abs.GetMeasueStatusButtonColor(),"rgba(255, 255, 0, 1)","Measure falls under 'Not in Population' ");

		driver.quit();

	}

}