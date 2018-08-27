package Rapid_ED;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(utilityListeners.TestNGListeners.class)
public class gmailCheck {
	
	
	@Test
	public static void main(String[] args) {
	    // TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://accounts.google.com/ServiceLogin?");

	// gmail login
	driver.findElement(By.id("Email")).sendKeys("ravi.kumar@kanakasoftware.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("Ravi@kanaka12345");
	driver.findElement(By.id("signIn")).click();

	// some optional actions for reaching gmail inbox
	driver.findElement(By.xpath("//*[@id='gbwa']/div/a/svg/path")).click();
	driver.findElement(By.id("gb2")).click();

	// now talking un-read email form inbox into a list
	java.util.List<WebElement> unreademeil = driver.findElements(By.xpath("//*[@class='zF']"));

	// Mailer name for which i want to check do i have an email in my inbox 
	String MyMailer = "Udacity";

	// real logic starts here
	for(int i=0;i<unreademeil.size();i++){
	    if(unreademeil.get(i).isDisplayed()==true){
	        // now verify if you have got mail form a specific mailer (Note Un-read mails)
	        // for read mails xpath loactor will change but logic will remain same
	        if(unreademeil.get(i).getText().equals(MyMailer)){
	            System.out.println("Yes we have got mail form " + MyMailer);
	            // also you can perform more actions here 
	            // like if you want to open email form the mailer
	            break;
	        }else{
	            System.out.println("No mail form " + MyMailer);
	        }
	    }
	}
}
}
