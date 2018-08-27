package Rapid_ED;

	import java.io.File;
	import java.io.IOException;
	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class TestDDT1 {

	WebDriver driver;
	Workbook wb;
	Sheet sh1;
	int numrow;
	String username;
	String password;

	@BeforeTest
	public void Setup()

	{
	//driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ue\\Downloads\\Chrome_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		wait wt = new wait();
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test(dataProvider="chk22")
	public void TestFireFox(String uname,String password1)

	{

	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(password1);
	}

	@DataProvider(name="chk22")
	public Object[][] TestDataFeed(){

	try {

	// load workbook
	wb=Workbook.getWorkbook(new File("C:\\Users\\ue\\Desktop\\chk22.xlsx"));

	// load sheet in my case I am referring to first sheet only
	sh1= wb.getSheet(0);

	// get number of rows so that we can run loop based on this
	numrow= sh1.getRows();
	}
	catch (Exception e)

	{
	e.printStackTrace();
	}

	// Create 2 D array and pass row and columns
	Object [][] facebookdata=new Object[numrow][sh1.getColumns()];

	// This will run a loop and each iteration  it will fetch new row
	for(int i=0;i<numrow;i++){

	// Fetch first row username
	facebookdata[i][0]=sh1.getCell(0,i).getContents();
	// Fetch first row password
	facebookdata[i][1]=sh1.getCell(1,i).getContents();

	}

	// Return 2d array object so that test script can use the same
	return facebookdata;
	}

	@AfterTest
	public void QuitTC(){

	// close browser after execution
	driver.quit();
	}

	}
