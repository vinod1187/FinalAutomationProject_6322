package kapsons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kapsons_Login 
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
				driver.get("https://www.kapsons.com/index.php?route=account/login");
				Thread.sleep(2000);
		
				//Email	

				driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vm881222@gmail.com");
				Thread.sleep(2000);
							
				//Password
				driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Pass@123)))");
				Thread.sleep(2000);
				
				//Login
				driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
				Thread.sleep(2000);
				
				driver.close();		  


}


}