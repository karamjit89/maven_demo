import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintestcase 
{
    public static WebDriver driver;
	@Test
	public void launch_browser()
	{
	   String driverpath=System.getProperty("user.dir")+"\\src\\test\\java\\Browsers_new\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver",driverpath);
	   driver= new ChromeDriver();
		
	}
	@Test(priority=1)
	public void launch_app()
	{
		driver.get("https://www.facebook.com/");
	}
	

}
