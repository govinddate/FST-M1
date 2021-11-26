package Project_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity1 {
 @Test
	public static void main() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		boolean status = driver.getTitle().contentEquals("Alchemy LMS – An LMS Application");
		
		System.out.println("Title Matches: " + status);
		
		driver.close();
		

	}

}
