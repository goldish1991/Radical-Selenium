package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyRightClick {
	
	@Test
	public void method1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "D:\\Training\\TrainingContent\\SeleniumJars_Software\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions builder = new Actions(driver);
		builder.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul/li[contains(@class,'edit')]/span")).click();
		//WebElement elementEdit =driver.findElement(By.cssSelector(".context-menu-item.icon.icon-edit>span"));
		//elementEdit.click();
		
		
		//builder.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
//		driver.get("http://seleniumhq.org");
//		WebElement ele = driver.findElement(By.xpath("//a[@title='Selenium Projects']"));
//		Actions builder = new Actions(driver);
//		builder.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		
	}

}
