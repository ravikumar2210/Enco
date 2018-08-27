package Rapid_ED;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import library.Utility;
import library.highLight;

	
	@Listeners(utilityListeners.TestNGListeners.class)
	
	public class luna_submissionAndinstallation extends wait{
		
		@Test
		public void buildsubmission() throws Exception {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			wait wt = new wait();
			
			driver.manage().window().maximize();

			driver.get("http://luna/");
			
			Thread.sleep(5000);
			
			
			//Click on Engineering tab on top menu
			
			WebDriverWait wait = new WebDriverWait(driver, 15);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='HeaderMenu_DXI5_T']/span")));
			
			System.out.println("Engineering Tab is Visible");

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='HeaderMenu_DXI5_T']/span")));
			
			System.out.println("Engineering Tab is clickable");
			
			Actions actions = new Actions(driver);
			WebElement EnggmainMenu = driver.findElement(By.xpath("//*[@id='HeaderMenu_DXI5_T']/span"));
			actions.moveToElement(EnggmainMenu);
			System.out.print("Engineering Tab is mouse hovered");
			
			wt.implicitewait();

			WebElement subBulReq = driver.findElement(By.xpath("//*[@id='HeaderMenu_DXI5i3_T']/span"));
			actions.moveToElement(subBulReq);
			actions.click().build().perform();
			  	  
			System.out.println("subBulReq Tab is clicked");
			
			Thread.sleep(10000);
			
			  driver.navigate().to("http://luna/Work/SubmitBuild");
			  	
			boolean present;
			
			try {
				
				WebElement test= driver.findElement(By.xpath("//*[@id='AgentDbId']"));
				  
				present = true;
				highLight.highLightElement(driver, test);
				Thread.sleep(5000);
				System.out.println("ele available");

			   
			} 
			
			catch (NoSuchElementException e) {
			   present = false;
			   System.out.println("ele not available");
			}
			
			  if(!driver.findElements(By.xpath("//*[@id='submit']")).isEmpty()){
			        //THEN CLICK ON THE SUBMIT BUTTON
				  
			    }else{
			        //DO SOMETHING ELSE AS SUBMIT BUTTON IS NOT THERE
			    } 
			
			driver.findElement(By.xpath("//*[@id='AgentDbId']/option[336]")).click();
			
			wt.implicitewait();
			
			driver.findElement(By.xpath("//*[@id='BranchDbId']/option[340]")).click();
			
			wt.implicitewait();

//			//Click on Build submission Request
//			
//			driver.findElement(By.xpath("//*[@id='BranchDbId']/option[340]")).click();
//			
//			System.out.print("Submit Build Request option is clicked");
						  
 						
//			//Click on submit build request
//			
//			driver.findElement(By.xpath("//*[@id='HeaderMenu_DXI5i3_T']/span")).click();
//
//			// Check if Agent dropdown is displayed on the WebPage
//			
//			WebElement agentdd = driver.findElement(By.xpath("//*[@id='AgentDbId']"));
//
//			Boolean checkSaveIsDisplayed = agentdd.isDisplayed();
//			
//			Boolean checkSaveIsEnabled = agentdd.isEnabled();
//
//
//			if (checkSaveIsDisplayed == true && checkSaveIsEnabled== true) {
//				
//			System.out.println("agentdd is displayed and enabled");
//			
//			agentdd.click();
//			
//			}
//			
 			driver.quit();
//				

}

	}