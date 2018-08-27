package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import PageFactory.Guru99HomePage;

import PageFactory.Guru99Login;
//import Rapid_ED.wait;

public class Test99GuruLoginWithPageFactory {

    WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    

    @BeforeTest

    public void setup(){

    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//wait wt = new wait();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://demo.guru99.com/V4/");

    }

    /**

     * This test go to http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    objLogin = new Guru99Login(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

    objLogin.loginToGuru99("mgr123", "mgr!23");

    // go the next page

    objHomePage = new Guru99HomePage(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
    

}