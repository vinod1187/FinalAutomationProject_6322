package kapsons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Kapsons_POM 
{
	
		public void maximizeBrowser(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		public void url(WebDriver driver)
		{
			driver.get("https://www.kapsons.com/index.php?route=account/login");
		}
		
		public void EmailAddress(WebDriver driver, String usn)
		{
			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys(usn);
			
		}
		
		public void passWord(WebDriver driver, String pwd)
		{
			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys(pwd);
		}
		
		public void loginButton(WebDriver driver)
		{
			driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
			
		}
		public void myAccount(WebDriver driver)
		{
			driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]")).click();
			
		}

		public void logOut(WebDriver driver)
		{
			driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[10]")).click();
		
		}
		public void CloseBrowser(WebDriver driver)
		{
			driver.close();


	}

	}

