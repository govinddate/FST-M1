package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity_7 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[9]/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("addWorkExperience")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("experience_employer")).sendKeys("IBM India");
		  driver.findElement(By.id("experience_jobtitle")).sendKeys("Senior Technical services specialist");
			//From date selected
			driver.findElement(By.xpath("//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[3]/img")).click();
			Thread.sleep(3000);
			Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
			year.selectByVisibleText("2021");
			Thread.sleep(1000);
			 Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
				month.selectByVisibleText("Oct");
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();
			
			//To date selected
			driver.findElement(By.xpath("//*[@id=\"frmWorkExperience\"]/fieldset/ol/li[4]/img")).click();
			Thread.sleep(3000);
			Select year1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
			year1.selectByVisibleText("2021");
			Thread.sleep(1000);
			 Select month1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
				month1.selectByVisibleText("Oct");
				Thread.sleep(1000);		
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();
				Thread.sleep(1000);
		  driver.findElement(By.id("experience_comments")).sendKeys("demo comment");
		  Thread.sleep(2000);
		  driver.findElement(By.id("btnWorkExpSave")).click();
		  Thread.sleep(2000);	
		  System.out.println("Activity 7 executed successfully");
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
