package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity_2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement wl=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/img"));
	  System.out.println("Url of image is "+wl.getAttribute("src"));
	  Thread.sleep(2000);
	  System.out.println("Activity 2 executed successfully");
	  
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
