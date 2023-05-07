package com.HRM.Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginHRM {
    
	WebDriver driver;
    
     @BeforeClass
	public void BeforeTestExecution()
	{
		
    	ChromeOptions option= new ChromeOptions(); 
    	option.addArguments("--remote-allow-origins=*");
    	
    	driver = new ChromeDriver(option);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @AfterClass
    public void AfterTestExecution()
    {
    	driver.quit();
    }
	
	@Test(priority=1)
	public void TestCase1()
	{
		try {
            
			// For User Name
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
			Thread.sleep(2000);
			
			// For Password
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
			Thread.sleep(2000);
			
			// For Login
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=2)
	public void TestCase2()
	{
		try {
             // For MY Info option
		    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
		    Thread.sleep(2000);
			
            // For Personal Details
			driver.findElement(By.linkText("Personal Details")).click();
			Thread.sleep(2000);
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=3)
	public void TestCase3()
	{
		try {
			 //For Employee name
			driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("Ankit");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("Shyamdev");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Bhagat");
			Thread.sleep(2000);
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=4)
	public void TestCase4()
	{
		try {
			    //Nickname
				driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("Anku");
				Thread.sleep(2000);
				
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
   @Test(priority=5)
	public void TestCase5()
	{
		try {
            //Employee Id
			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]")).sendKeys("786");
		    Thread.sleep(2000);
					
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=6)
	public void TestCase6()
	{
		try {
			  //Other ID
		    driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[4]")).sendKeys("9545");
			Thread.sleep(2000);
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=7)
	public void TestCase7()
	{
		try {
			//Driver's License Number
			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[5]")).sendKeys("PRO123456");
			Thread.sleep(2000);
			
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=8)
	public void TestCase8()
	{
		try {
			//LicenseExpiry Date
			     driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-mm-dd\"])[1]")).click();
			     Thread.sleep(2000);
			
		    //license Expiry years
			
		       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/div")).click();
			   List<WebElement> year_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/ul"));
			   System.out.println(year_list.size());
			   for(WebElement year : year_list)
			{
		   	   if (year.getText().equalsIgnoreCase("(//li[@class=\"oxd-calendar-dropdown--option\"])[40]")) {
					year.click();
					break;
				}
			}
			   Thread.sleep(2000);
			
			//licenseExpiry month
			   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/div")).click();
			   List<WebElement> month_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/ul"));
			   System.out.println(month_list.size());
			   for(WebElement month : month_list)
			{
			   if (month.getText().equalsIgnoreCase("(//li[@class=\"oxd-calendar-dropdown--option\"])[10]")) {
					month.click();
					break;
				}
			}
			   Thread.sleep(2000);
			
			//licenseExpiry day
			   List<WebElement> day_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]"));
			   System.out.println(day_list.size());
			   for(WebElement day : day_list)
			{
			   if (day.getText().equalsIgnoreCase("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/div[23]/div")) {
					day.click();
					break;
				}
			}
			   Thread.sleep(2000);
		
		     } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=9)
	public void TestCase9()
	{
		try {
			//SSN Number
			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[6]")).sendKeys("A98765");
			Thread.sleep(2000);
			
		    } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=10)
	public void TestCase10()
	{
		try {
			//SIN Number
			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[7]")).sendKeys("B123456");
			Thread.sleep(2000);
				
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=11)
	public void TestCase11()
	{
		try {
			//Nationality
			   String Nationality ="lndian";
			   driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]")).click();
			   List<WebElement> national = driver.findElements(By.xpath("//div[@role=\"listbox\"]"));
			   for (WebElement option:national)
			{
			   String CurrentOption = option.getText();
			   if(CurrentOption.contains(Nationality))	{
					option.click();
					break;
				}
		}
		    Thread.sleep(2000);
			
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
    @Test(priority=12)
	public void TestCase12()
	{
		try {
			//MaritalStatus
		       String Status ="Single";
			   driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]")).click();
			   List<WebElement> Marital_Status = driver.findElements(By.xpath("//div[@role=\"listbox\"]"));
			   for (WebElement option:Marital_Status)
			{
			   String CurrentOption = option.getText();
			   if(CurrentOption.contains(Status))	{
					option.click();
					break;
				}
			}
		       Thread.sleep(2000);
			
             } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=13)
	public void TestCase13()
	{
		try {
			//Date OF Birth
			    driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-mm-dd\"])[2]")).sendKeys("1998/12/23");
    		    Thread.sleep(3000);
    			
		   //Date of birth year
    		   
			    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]")).click();
				List<WebElement> years_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[2]/ul"));
				System.out.println(years_list.size());
				for(WebElement year : years_list)
				{
					if (year.getText().equalsIgnoreCase("(//li[@class=\"oxd-calendar-dropdown--option\"])[20]")) {
						year.click();
						break;
					}
				}
				Thread.sleep(2000);
				
			//Date of birth month
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/ul/li[1]/div/i")).click();
				List<WebElement> months_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[3]"));
					System.out.println(months_list.size());
				for(WebElement month : months_list)
				{
					if (month.getText().equalsIgnoreCase("(//li[@class=\"oxd-calendar-dropdown--option\"])[11]")) {
						month.click();
						break;
					}
				}
				Thread.sleep(2000);
				
				//Date of birth day
				List<WebElement> days_list =driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]"));
				System.out.println(days_list.size());
				for(WebElement day : days_list)
				{
					if (day.getText().equalsIgnoreCase("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div[3]/div[23]/div")) {
						day.click();
						break;
					}
				}
				Thread.sleep(2000);
			
	            } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=14)
	public void TestCase14()
	{
		try {
			//Gender
			driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
			Thread.sleep(3000);
			
			} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=15)
	public void TestCase15()
	{
		try {
			// MiltaryService
			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[9]")).sendKeys("Two_years_experience");
			Thread.sleep(3000);
			
		    } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=16)
	public void TestCase16()
	{
		try {
			// smoker
			driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
			Thread.sleep(3000);
		
          } catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
    
	@Test(priority=17)
	public void TestCase17()
	{
		try {
            // Custom Fields ( Blood Type )
			String Custom ="A+";
			driver.findElement(By.xpath("(//div[@class=\\\"oxd-select-text-input\\\"])[3]")).click();
			List<WebElement> blood_type = driver.findElements(By.xpath("//div[@role=\"listbox\"]"));
			for (WebElement option:blood_type)
			{
				String CurrentOption = option.getText();
				if(CurrentOption.contains(Custom))	{
					option.click();
					break;
				}
			}
		    Thread.sleep(2000);
		} catch (Exception a) {
			System.out.println(a.getMessage());
		}
	}
	
	@Test(priority=18)
		public void TestCase18()
		{
			try {
				// Required_Save
				driver.findElement(By.xpath(" (//button[@type=\"submit\"])[2]")).click();
				Thread.sleep(3000);
				
	        } catch (Exception b) {
			System.out.println(b.getMessage());
		}
	  }
	}
