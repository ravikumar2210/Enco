package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		
			
			try {
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);           
				
				// now copy the  screenshot to desired location using copyFile method
				 
				FileUtils.copyFile(src, new File("./Screenshots/"  +screenshotName+ ".png"));     
				
				System.out.println("Screenshot Taken");
			} 
			
			//  Exception is a base class
					
			catch (Exception e) {
				// TODO Auto-generated catch block
				
				System.out.println("Exception while Taking Screenshot"  + e.getMessage());
			} 
	}

			

}
