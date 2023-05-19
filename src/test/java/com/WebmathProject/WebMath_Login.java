package com.WebmathProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebMath_Login {
   
	WebDriver driver;
    @BeforeClass
	public void beforeMethod()
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-oigin=*");
		
	    driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.webmath.com/");
		
	}
    @AfterClass
    public void aftermethod() {
    	driver.quit();
    	
    }

	@Test(priority=1)
	public void TestCase1()
	{
		try {
            
			// For Home
			driver.findElement(By.linkText("home")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
			
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TestCase2()
	{
		try {
            
			// For Contact Us
			driver.findElement(By.linkText("Contact Us")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
				
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

    @Test(priority=3)
	public void TestCase3()
	{
		try {
            
			// For About WebMath
			driver.findElement(By.linkText("About WebMath")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);

		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=4)
	public void TestCase4()
	{
		try {
            
			// For Why WebMath
			driver.findElement(By.linkText("Why WebMath")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

	        } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=5)
	public void TestCase5()
	{
		try {
            
			// For WebsiteMap
			driver.findElement(By.linkText("Website Map")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=6)
	public void TestCase6()
	{
		try {
            
			// For Privacy Policy
			driver.findElement(By.linkText("Privacy Policy")).click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=7)
	public void TestCase7()
	{
		try {
            
			
			// For General Math
			driver.findElement(By.linkText("General Math")).click();
			Thread.sleep(2000);
			
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=8)
	public void TestCase8()
	{
		try {
			// For Multipy
			driver.findElement(By.linkText("Multiply")).click();
			Thread.sleep(2000);
						
					
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=9)
	public void TestCase9()
	{
		try {
			// For First Block
			driver.findElement(By.xpath("//input[@name=\"atop1\"]")).sendKeys("5");
			Thread.sleep(2000);
						
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=10)
	public void TestCase10()
	{
		try {
			// For second block
			driver.findElement(By.xpath("//input[@name=\"atop2\"]")).sendKeys("5");
			Thread.sleep(2000);
						
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=11)
	public void TestCase11()
	{
		try {
			// For Third Block
			driver.findElement(By.xpath("//input[@name=\"abottom1\"]")).sendKeys("5");
			Thread.sleep(2000);
						
					
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=12)
	public void TestCase12()
	{
		try {
			// For Fourth Block
			driver.findElement(By.xpath("//input[@name=\"abottom2\"]")).sendKeys("5");
			Thread.sleep(2000);
						
					
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=13)
	public void TestCase13()
	{
		try {
			// For Multiply
			driver.findElement(By.linkText("Multiply")).click();
			Thread.sleep(2000);
						
		    } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=14)
	public void TestCase14()
	{
		try {
			// For General Math
						driver.findElement(By.linkText("General Math")).click();
						Thread.sleep(2000);
								
					
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	
	  @Test(priority=15)
	 
	public void TestCase15()
	{
		try {
            
			
		// For Choose Math Help Item
		     WebElement choose =driver.findElement(By.id("topicItem"));
		    Select a1= new Select(choose);
		    a1.selectByVisibleText("Interest, Simple");
			Thread.sleep(2000);
		
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=16)
	public void TestCase16()
	{
		try {
            
			// For Principal amount
			driver.findElement(By.xpath("//input[@name=\"principal\"]")).sendKeys("10");
			Thread.sleep(2000);
		
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=17)
	public void TestCase17()
	{
		try {
            
		    // For Interest
			driver.findElement(By.xpath("//input[@name=\"interest\"]")).sendKeys("10");
			Thread.sleep(2000);
		
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=18)
	public void TestCase18()
	{
		try {
            
			// For Interest dropdown
			WebElement a2=driver.findElement(By.xpath("//select[@name=\"interest_units\"]"));
			Select dropInterest = new Select(a2);
			dropInterest.selectByValue("1");
			Thread.sleep(2000);
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=19)
	public void TestCase19()
	{
		try {
           
			   // For Desired time
    			  driver.findElement(By.xpath("//input[@name=\"desired_time\"]")).sendKeys("10");
			      Thread.sleep(2000);
					
		     } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	@Test(priority=20)
	public void TestCase20()
	{
		try {
           
			   // For Dropdown desired time
    			  WebElement a3 =driver.findElement(By.xpath("//input[@name=\"desired_time_units\"]"));
    			  Select droptime =new Select(a3); 
    			  droptime.selectByValue("1");
			      Thread.sleep(2000);
					
		     } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=21)
	public void TestCase21()
	{
		try {
           
			   // For amount of interest
    			  driver.findElement(By.xpath("//input[@value=\"Find the amount of interest\"]")).sendKeys("10");
    			  Thread.sleep(2000);
					
		     } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}

	@Test(priority=22)
	public void TestCase22()
	{
		try {
           
			   // Back to the problem
			    driver.findElement(By.xpath("//*[@id=\"d-mainContainer\"]/div[3]/a/img")).click();
			    Thread.sleep(2000);
					
		     } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}


}

