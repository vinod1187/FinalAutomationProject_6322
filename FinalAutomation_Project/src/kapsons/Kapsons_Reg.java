package kapsons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kapsons_Reg 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\documentws\\Automation Testing\\Browser Extension\\chromedriver.exe");
		
		
		
		WebDriver driver= new ChromeDriver();
		Thread.sleep(2000);
		
				//Maximum browser
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//URL
				driver.get("https://www.kapsons.com/index.php?route=account/register");
				Thread.sleep(2000);
				
						
				//UserName
				driver.findElement(By.xpath("//*[@id=\"input-registration-firstname\"]")).sendKeys("vinod kumar");
			Thread.sleep(2000);
				
				
				
				//Email Address
				driver.findElement(By.xpath("//*[@id=\"input_6\"]")).sendKeys("vm881222@gmail.com");
				Thread.sleep(2000);
				
				//First Name
				driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("vinod");
				Thread.sleep(2000);
				
				//Last Name
				driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("kumar");
				Thread.sleep(2000);
				
				
//				Password
				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Pass@123)))");
				Thread.sleep(2000);
				
//				Confirm Password
				driver.findElement(By.xpath("//*[@id=\"input_8\"]")).sendKeys("Pass@123)))");
				Thread.sleep(2000);
				
				
				driver.findElement(By.xpath("/html/body/login-dialog/div/signup/div/form/div[2]/div[1]/div[2]/div/button")).click();
				
				
				

				

	}

}
