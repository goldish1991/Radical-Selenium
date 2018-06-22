package advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyMultipleWindowProgram {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wiziq.com/tutorial/810773-selenium-presentation-updated#");
		Thread.sleep(1000);
		String pWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//a/span[contains(text(),'Login with Facebook')]")).click();
		
		Set<String> winIDs = driver.getWindowHandles();
		String cWin = null;
		for (String windID : winIDs) {
			if(!windID.equals(pWin)){
				cWin = windID;
			}
		}
		driver.switchTo().window(cWin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("goldish");
		
		driver.switchTo().defaultContent();
	}

}
