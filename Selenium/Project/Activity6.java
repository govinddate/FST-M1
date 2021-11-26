package Demo.Project_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_6 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b")).isDisplayed();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b")));
		element.click();
		 // WebElement s=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1"));
		String s=driver.findElement(By.xpath(("//*[@id=\"content\"]/div[1]/div[1]/h1"))).getText();
		 Assert.assertEquals("Search Directory",s);
		 System.out.println("Activity 6 executed successfully");
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
