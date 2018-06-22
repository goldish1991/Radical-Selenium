package advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyImplicitWait {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='lst-ibxx']")).sendKeys("");
		System.out.println("Script running");
		driver.findElement(By.xpath(""));
	}

}
