package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class Activity_4 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.or(
		     ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee"))
		    
		 ));
		 driver.findElement(By.id("menu_pim_addEmployee")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.id("firstName")).sendKeys("ABC");
		 driver.findElement(By.id("lastName")).sendKeys("PQR");
		 driver.findElement(By.id("employeeId")).clear();
		 String imd="101";
		driver.findElement(By.id("employeeId")).sendKeys(imd);
		 Thread.sleep(2000);
		 WebElement uploadElement = driver.findElement(By.id("photofile")); 
		 uploadElement.sendKeys("C:\\Users\\0024C1744\\Downloads\\My documents\\Peronal document\\Capture.png");
		 Thread.sleep(2000);
		 driver.findElement(By.id("btnSave")).click();
		 Thread.sleep(2000); 
		 driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("empsearch_id")).sendKeys(imd);
		 Thread.sleep(1000);
		 driver.findElement(By.id("searchBtn")).click();
		 Thread.sleep(3000);
		 WebElement we=driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a"));
		 
	
		 Thread.sleep(2000);
		 System.out.println("Activity 4 executed successfully");
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
