package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyDropDownBoxPractise1 {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		FirefoxDriver ff = new FirefoxDriver();
		ff.get("http://toolsqa.wpengine.com/automation-practice-form/");
		ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		ff.executeScript("document.getElementById('continents').scrollIntoView(true);");
		WebElement element = ff.findElement(By.xpath("//select[@id='continents']"));
		Actions action = new Actions(ff);
		Thread.sleep(5000);
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		action.click();
		Thread.sleep(2000);
		ff.findElement(By.xpath("//select[@id='continents']/option[contains(text(),'Australia')]")).click();
	}
	

}