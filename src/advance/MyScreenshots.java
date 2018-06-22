package advance;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyScreenshots {
	
	@Test
	public void method() throws InterruptedException, IOException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		boolean result = true;
		try{
		driver.get("http://www.freefileconvert.com/");
		driver.findElement(By.xpath("//input[@id='lst-ibxx']"));
		}catch(Exception e){
			TakesScreenshot obj = (TakesScreenshot)driver;
			File ScrFile = obj.getScreenshotAs(OutputType.FILE);
			String Title = driver.getTitle();
			String myTimeStamp = new SimpleDateFormat("yyyymmdd_hhmmss").format(Calendar.getInstance().getTime());
			Class<? extends WebDriver> Class = driver.getClass();
			FileUtils.copyFile(ScrFile, new File("C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Screenshot\\"+"Project_"+"myTimeStamp_"+"Class_"+".png"));
			result = true;
			Assert.assertTrue(result);
		}
	}

}
