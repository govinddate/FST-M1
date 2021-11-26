package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity_1 {
	WebDriver driver;
  @Test
  public void f() {
	  String title=driver.getTitle();
	  System.out.println("The title of the webpage is"+title);
	  Assert.assertEquals("OrangeHRM",title);
	  System.out.println("Activity 1 executed successfully");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.navigate().to("http://alchemy.hguy.co/orangehrm");
	
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}
