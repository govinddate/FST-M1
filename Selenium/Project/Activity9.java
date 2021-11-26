package Demo.Project_HRM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity_9 {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.findElement(By.id("txtUsername")).sendKeys("orange");
		  driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		  driver.findElement(By.id("btnLogin")).click();
		  Thread.sleep(3000);
	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	Thread.sleep(2000);	
	Actions actions = new Actions(driver);
	WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[3]/a"));
	actions.moveToElement(mainMenu);
	   Thread.sleep(3000);
	   mainMenu.click();
	   Thread.sleep(2000);
	   List<WebElement> allRows = driver.findElements(By.id("emgcontact_list")); 
	   for (WebElement row : allRows) { 
	       List<WebElement> cells = row.findElements(By.tagName("td")); 
	       for (WebElement cell : cells) {         
	       System.out.println(cell.getText());
	   }
	   }
	   System.out.println("Activity 9 executed successfully");
	  }//.....
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
