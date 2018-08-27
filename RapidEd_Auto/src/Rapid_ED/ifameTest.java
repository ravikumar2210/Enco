package Rapid_ED;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifameTest {
	
	public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			wait wt = new wait();
			
			driver.get("http://toolsqa.wpengine.com/iframe-practice-page/");

			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);

			//By finding all the web elements using iframe tag
			java.util.List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
			System.out.println("The total number of iframes are " + iframeElements.size());
			
			//Switch by Index
			driver.switchTo().frame(0);
			System.out.println("switched to frame 0");
						
			//Do all the required tasks in the frame 0
			//Switch back to the main window
			driver.switchTo().defaultContent();
			System.out.println("switched back to parent frame");
			driver.quit();

}
	
}

