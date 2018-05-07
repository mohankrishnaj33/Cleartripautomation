package scripts;

import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import config.StartBrowser;
import objectrep.Homepage;
import objectrep.LoginPage;

public class TC1 extends StartBrowser {
  @Test
  public void signin() 
  {
	  CommonMethods cm = new CommonMethods();
	  cm.launchapplication("https://www.naukri.com");
	  cm.click(Homepage.lnksign);
	  cm.timeout(30);
  }
}
