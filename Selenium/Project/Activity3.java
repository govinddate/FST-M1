package Project_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity3 {

	@Test
	public static void main() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String Title = driver.findElement(By.xpath("//*[@id=\"uagb-infobox-f08ebab0-fbf1-40ec-9b2a-c9feeb3d4810\"]/div/div/div/div[2]/h3")).getText();
		
        boolean status = Title.contentEquals("Actionable Training");
		
		System.out.println("Title Matches: " + status);
		
		driver.close();


	}

}
