package Project_Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity7 {

	@Test
	public static void main() 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.linkText("All Courses")).click();
		
		List<WebElement> courses = driver.findElements(By.className("attachment-course-thumb"));
		
		System.out.println("Number of available courses: " +courses.size());

		driver.close();
	}

}
