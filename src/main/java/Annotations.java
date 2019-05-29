import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
	WebDriver driver;
	@BeforeSuite
	public void Suite()
	{
		System.out.println("First suite statement");
	}
	@BeforeTest
	public void Test1()
	{
		System.out.println("First test statement");
	}
	@BeforeClass
	public void method2()
	{
		System.out.println("Class first statement");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("First statement");
	}
	
	/*@Test
	public void alaunchBrowser()
	{
		String driverpath=System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		// WebDriver driver=new ChromeDriver();
		//use the driver becoz driver is localvariable and driver is use in another method so driver will be declare globally
		//and webdriver driver is not with value,value will be declare in driver in method ie driver=new ChromeDriver();
        driver=new ChromeDriver();
		//to remove the 
	}
	@Test
	public void launchapp()
	{
		driver.get("https://www.facebook.com/");
	}*/

	@AfterMethod
	public void method1()
	{
		System.out.println("Last statement");
	}
	@AfterClass
	public void method3()
	{
		System.out.println("class Last statement");
	}
	@AfterTest
	public void Test2()
	{
		System.out.println("Last test statement");
	}
	@AfterSuite
	public void suite()
	{
		System.out.println("Last suite statement");
	}
	
	/*@Test
	public void blaunchapp()
	{
		driver.get("https://www.facebook.com/");
	}*/

	
}
