package Project_Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity9 {

	@Test
	public static void main() 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		
		driver.findElement(By.linkText("All Courses")).click();
		
		driver.findElement(By.xpath("//*[@id=\"post-69\"]/div[2]/p[2]/a")).click();
		
		driver.findElement(By.linkText("Login to Enroll")).click();
		
		
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ld-expand-83\"]/div[1]/a/div[2]")).click();
		
        String Title = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/h1")).getText();
		
        boolean status = Title.contentEquals("Developing Strategy");
		
		System.out.println("Title Matches: " + status);
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"learndash_post_83\"]/div/div[4]/div[2]/a/span[1]"));
		String ButtonContent = Button.getText();
		boolean exist = ButtonContent.contentEquals("Mark Complete");
		System.out.println("Mark Complete button displayed : " +exist);
		
		if(exist==true) {
			Button.click();
		}
		
		driver.close();

	}
}
