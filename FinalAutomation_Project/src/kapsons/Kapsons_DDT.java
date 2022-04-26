package kapsons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Kapsons_DDT 
{

	WebDriver driver;
	
	@BeforeTest
  public void beforeTest() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\documentws\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		
  }
		
		 @Test(dataProvider = "dp1", priority=1, description = "Performing DataDriven On Kapsons Web Application With 6 Test Data")
		  public void Kapsons_DDT1(String username, String password) throws InterruptedException 
		  {
			  Kapsons_POM k=new Kapsons_POM();
			  
			  	k.url(driver);
			  	k.EmailAddress(driver, username);
			  	k.passWord(driver, password);
			  	k.loginButton(driver);
			  	Thread.sleep(2000);
			  	k.myAccount(driver);
			  	Thread.sleep(2000);
			  	k.logOut(driver);
			  
		  }

	@DataProvider
	public Object[][] dp1() 
	{
	  return new Object[][] 
	  {
	    new Object[] { "test", "test" },
	    new Object[] { "vm881222@gmail.com", "Pass@123)))" },
	    new Object[] { "sys", "sys@123" },
	    new Object[] { "test", "test1" },
	    new Object[] { "vm881222@gmail.com", "Pass@123)))" },
	    new Object[] { "Ouser", "Ouser1" },
	  };
	}


	@AfterTest
	public void afterTest() 
	{
		
		  driver.close();
	}

				
				
			}



