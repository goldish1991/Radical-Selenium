package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyActionClass {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement emailTxtBox = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		Actions myAction = new Actions(driver);
		Actions obj = myAction.moveToElement(emailTxtBox).click().keyDown(emailTxtBox, Keys.SHIFT).sendKeys(emailTxtBox, "selenium");
		obj.build().perform();
	}

}
