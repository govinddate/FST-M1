package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity_3 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys("orange");
	  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  String hp="menu_dashboard_index";
	  if(driver.findElement(By.id(hp)).isDisplayed())
	  {
		  System.out.println("Homepage is display");
		 
	  }
	  else
	  {
		 
	  }
	  System.out.println("Activity 3 executed successfully");
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new FirefoxDriver();
	  driver.navigate().to("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	 
  }

}
