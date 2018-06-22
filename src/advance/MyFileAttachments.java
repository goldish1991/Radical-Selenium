package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyFileAttachments {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.freefileconvert.com/");
		//this is going to work only in case of Input tag and type = file
		driver.findElement(By.id("first_file")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\E-Ticket_30Apr2018.pdf");
		Thread.sleep(3000);
	}

}
