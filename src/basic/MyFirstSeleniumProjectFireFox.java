package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumProjectFireFox {

		@Test
		public void method() throws InterruptedException{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.seleniumhq.org");
			boolean result = true;
			String msg = "";
			
			try{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li/a[@title='Selenium Projects']")).click();
			}catch(Exception e){
				System.out.println("Projects tab is missing");
				result = false;
				msg = msg + " Project tab is missing";
			}
			
			try{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/ul/li/a[@title='Get Selenium']")).click();
			}catch(Exception e){
				System.out.println("Projects tab is missing");
				result = false;
				msg = msg + " Download tab is missing";
			}
			
			try{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//ul/li[@id='menu_documentation']")).click();
			} catch (Exception e) {
				System.out.println("Documentation tab is missing");
				result = false;
				msg = msg + " Documentation tab is missing";
			}
		
			try{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div/ul/li/a[@title='Get help with Selenium']")).click();
			}catch(Exception e){
				System.out.println("Support tab is missing");
				result = false;
				msg = msg + " Support tab is missing";
			}
			
			try{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div/ul/li/a[@title='Get help with Selenium']")).click();
			}catch(Exception e){
				System.out.println("Support tab is missing");
				result = false;
				msg = msg + " Support tab is missing";
			}
			
			driver.close();
			
			Assert.assertTrue(result, msg);
		}
		
	}

