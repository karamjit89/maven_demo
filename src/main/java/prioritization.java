import org.testng.annotations.Test;

public class prioritization 
{
     @Test(priority=1)
	public void browserLaunch()
	{
		System.out.println("Browser");
	}
     @Test(priority=2)
	public void applicationLaunch()
	{
		System.out.println("application");
	}
     @Test
	public void loginWithvalidcredentials()
	{
		System.out.println("Valid");
	}
     @Test
	public void loginWithInvalidcredentials()
	{
		System.out.println("Invalid");
	}




}
