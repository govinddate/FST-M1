package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity6 {

	@Test
	public static void main() 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.linkText("My Account")).click();
		
        String Title = driver.getTitle();
		boolean status = Title.contentEquals("My Account – Alchemy LMS");
		System.out.println("Title Matches: " + status);
		
		driver.findElement(By.xpath("//*[@id=\"uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91\"]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.className("login-submit")).click();
		
		 String element = driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a")).getText();
		
	     boolean matches = element.contentEquals("Howdy, root");
			
			System.out.println("User Matches: " + matches);
			
			driver.close();

	}

}
