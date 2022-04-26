package kapsons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Kapsons_FiveModules 
{

	WebDriver driver;
	
	@BeforeTest
  public void beforeTest() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\documentws\\Automation Testing\\Browser Extension\\chromedriver.exe");
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://www.kapsons.com/index.php?route=account/login");
		Thread.sleep(2000);

		//Login

		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vm881222@gmail.com");
		Thread.sleep(2000);
		
		//Password
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Pass@123)))");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"loginBtn\"]")).click();
		Thread.sleep(2000);

  }
	
		
		@Test
		public void smokeTesting() throws InterruptedException
		{
			
			//Step 1: Create Object Of Actions Class
			Actions a= new Actions(driver);
			
			//Step 2: Create Object Of List With WebElement
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"header\"]/nav/div/div/ul"));
			
			//Step 3: Store size of list
			int listSize=ls.size();
			
			//Step 4: For Loop
			for(int i=1; i<=listSize; i++)
			{
				
				//Wait
				Thread.sleep(2000);
				
				//Display Module Name
				System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul["+i+"]")).getText());
//				
//				//Perform Mouse Hover
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[1]/div[1]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[2]/div[1]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[3]/div[1]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[4]/div[1]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[5]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[6]/a"))).click().perform();
				
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[7]/a"))).click().perform();
									 
				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[8]/a"))).click().perform();
				
			}
		}
		
		@Test
		public void Fivemodules() throws InterruptedException
		{
			//Step 2: Create Object Of List With WebElement
			List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"header\"]/nav/div/div/ul"));
			
			//Step 3: Store size of list
			int listSize=ls.size();
			
			//Step 4: For Loop
			for(int i=1; i<=listSize; i++)
			{
				
				//Wait
				Thread.sleep(2000);
				
				//Display Module Name
				System.out.println(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul["+i+"]")).getText());
	
				//Perform Mouse Hover
//				a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[1]/div[1]/a"))).click().perform();
				
				//Men Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[1]/div[1]/a")).click();
				Thread.sleep(2000);
				
				//Click - Product -- > Men Module --> Super Dry Men Casual Wear Purple Polo T - Shirt
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div")).click();
				Thread.sleep(2000);

				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
				
				//Colour of Shirt
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div/label")).click();
				Thread.sleep(2000);
				
				//Select Quantity --> Selected 1
				driver.findElement(By.xpath("//*[@id=\"pincodeCheckBtn\"]")).click();
				Thread.sleep(2000);
				
				//Enter Pincode
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560002");
				Thread.sleep(2000);
				
				//Add To Cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
				Thread.sleep(2000);
				
			}
			
		}
		
				@Test(priority = 2)
				public void moduleTwo() throws InterruptedException
				{
				//Women module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[2]/div[1]/a")).click();
				Thread.sleep(2000);
				
				//Click --> Women Module ---> Kazo Women Casual Wear White Trouser With Belt					
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[8]/div")).click();
				Thread.sleep(2000);
				
				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
				
				//Size Of Chart
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div[2]/label")).click();
				Thread.sleep(2000);
				
				//Quantity --> Selected 1
				driver.findElement(By.xpath("//*[@id=\"pincodeCheckBtn\"]")).click();
				Thread.sleep(2000);
				
				//Enter Pincode
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560004");
				Thread.sleep(2000);
				
				//Add to Cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
				Thread.sleep(2000);
				
				}
				
				@Test(priority = 3)
				public void moduleThree() throws InterruptedException
				{
				//Kids Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[3]/div[1]/a")).click();
				Thread.sleep(2000);
				
				//Click --> Kids Module --> Chicoo Boys Black Casual Wear Jeans
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[7]/div")).click();
				Thread.sleep(2000);
				
				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
			
				//Size
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div[2]/label")).click();
				Thread.sleep(2000);
				
				//Quantity
				driver.findElement(By.xpath("//*[@id=\"pincodeCheckBtn\"]")).click();
				Thread.sleep(2000);
				
				//Enter Pincode
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560003");
				Thread.sleep(2000);
				
				//Add to Cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
				Thread.sleep(2000);
				
				}
				
				@Test(priority = 4)
				public void moduleFour() throws InterruptedException
				{
				//Accessories Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[4]/div[1]/a")).click();
				Thread.sleep(2000);
				
				//Click --. Accessories Module --> Tommy Hilfiger Leather Mens Solid Blue Cosmos Passcase Wallet
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div")).click();
				Thread.sleep(2000);
				
				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
				
				//Size
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div/label")).click();
				Thread.sleep(2000);
				
				//Quantity
				driver.findElement(By.xpath("//*[@id=\"quantity\"]")).click();
				Thread.sleep(2000);
				
				//Enter Pincode for Delivery
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560086");
				Thread.sleep(2000);
				
				//Add to Cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();			
				Thread.sleep(2000);
				
				}
				
				@Test(priority = 5)
				public void modulesFive() throws InterruptedException
				{
				//Brands Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[5]/a")).click();
				Thread.sleep(2000);
				
				//Click --> Brands Module --> 
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/div[1]/div/div[2]")).click();
				Thread.sleep(2000);
				
				//By Clicking Product
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[4]/div")).click();
				Thread.sleep(2000);
				
				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
				
				//Size
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div[2]/label")).click();
				Thread.sleep(2000);
				
				//Quantity -- Selected 1
				driver.findElement(By.xpath("//*[@id=\"pincodeCheckBtn\"]")).click();
				Thread.sleep(2000);
				
				//Enter Pincode for Delivery
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560003");
				Thread.sleep(2000);
				
				//Add to cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
				Thread.sleep(2000);
				
				//What's New Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[6]/a")).click();
				Thread.sleep(2000);
				
				//By Clicking Product
				driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
				Thread.sleep(2000);
				
				//Clicking Item
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div[2]/div[2]/figure/a")).click();
				Thread.sleep(2000);
				
				//Product
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div")).click();
				Thread.sleep(2000);
				
				//By Clicking Product --> Comes to Next tab
				for(String childTab:driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
				Thread.sleep(2000);
				
				//Select Product
				driver.findElement(By.xpath("//*[@id=\"input-option1\"]/div[2]/label")).click();
				Thread.sleep(2000);
				
				//click item
				driver.findElement(By.xpath("//*[@id=\"input-option2\"]/div/label")).click();
				Thread.sleep(2000);
				
				//Enter Quantity
				driver.findElement(By.xpath("//*[@id=\"quantity\"]")).click();
				Thread.sleep(2000);
				
				//Enter pincode
				driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("560002");
				Thread.sleep(2000);
				
				//Add to Cart
				driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
				Thread.sleep(2000);
				
				//Stores Module
				driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div/ul/li[8]/a")).click();
				Thread.sleep(2000);
				
				//My Account
				driver.findElement(By.xpath("//*[@id=\"top_menu\"]/div/div/div[3]/ul/li[1]/a")).click();
				Thread.sleep(2000);
				
				driver.get("https://www.kapsons.com/index.php?route=checkout/cart");
				
				driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
				
				for(String childTab:driver.getWindowHandles())
					{
						driver.switchTo().window(childTab);
					}
					Thread.sleep(2000);
					
				//First Name
				driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).sendKeys("Vinod kumar");
				Thread.sleep(2000);
				
				//Last Name
				driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).sendKeys("b");
				Thread.sleep(2000);
				
				//GST No
				driver.findElement(By.xpath("//*[@id=\"input-payment-gstin\"]")).sendKeys("12534");
				Thread.sleep(2000);
				
				//Company Name
				driver.findElement(By.xpath("//*[@id=\"input-payment-company\"]")).sendKeys("Polo");
				Thread.sleep(2000);
				
				//Address 1
				driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")).sendKeys("Bangalore K R Puram");
				Thread.sleep(2000);
				
				//Address 2
				driver.findElement(By.xpath("//*[@id=\"input-payment-address-2\"]")).sendKeys("Bangalore Basavangudi");
				Thread.sleep(2000);
				
				//Pincode
				driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")).sendKeys("560036");
				Thread.sleep(2000);
				
				//Payment Address
				driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]")).click();
				Thread.sleep(2000);		
				
				//Logout
				driver.findElement(By.xpath("//*[@id=\"top_menu\"]/div/div/div[3]/ul/li[2]/a")).click();
				Thread.sleep(2000);
				
	}

@AfterTest
public void afterTest() 
{

  driver.quit();
}

}