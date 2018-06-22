package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MySeleniumAssignment3 {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//alert window with only ok button
		driver.findElement(By.xpath("//div[@class='tab-content']/div/button[@onclick='alertbox()']")).click();
		//alert window verification
		Alert myAlrtobj = driver.switchTo().alert();
		String actuString = myAlrtobj.getText();
		Assert.assertEquals(actuString, "I am an alert box!");
		myAlrtobj.accept();
		
		driver.findElement(By.xpath("//li/a[@href='#CancelTab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='CancelTab']/button[@onclick='confirmbox()']")).click();
		
		//alert window verification woth ok and cancel button
		Alert myAlrtobj1 = driver.switchTo().alert();
		String actuString1 = myAlrtobj1.getText();
		Assert.assertEquals(actuString1, "Press a Button !");
		Thread.sleep(2000);
		myAlrtobj1.dismiss();
		}

}
