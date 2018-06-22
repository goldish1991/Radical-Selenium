package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyMouseHover {
	
	
	@Test
	public void testMethod1() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();;
		
		
	}

}
