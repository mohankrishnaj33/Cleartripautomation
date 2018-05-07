package commonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import config.StartBrowser;

public class CommonMethods 
{
	WebDriver driver;
	
	public CommonMethods() 
	{
		driver = StartBrowser.driver;
	}
	public void launchapplication(String url) 
	{
		driver.get(url);
	}
	public void sendkeys(By locator,String testdata) 
	{
		driver.findElement(locator).sendKeys(testdata);
	}
	public void click(By locator) 
	{
		driver.findElement(locator).click();
	}
	public void timeout(long timeunit) 
	{
		driver.manage().timeouts().implicitlyWait(timeunit, TimeUnit.SECONDS);
	}
}
