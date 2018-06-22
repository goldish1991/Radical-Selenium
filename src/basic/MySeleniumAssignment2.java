package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MySeleniumAssignment2 {

	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		//required for iframes implemantation
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//select[@name='cars']"));
		Select Sel = new Select(ele);
		
		//select cars
		Sel.selectByVisibleText("Opel");
		Thread.sleep(1000);
		Sel.selectByVisibleText("Audi");
		
		//deselect one car
		Thread.sleep(3000);
		Sel.deselectByVisibleText("Opel");
		
		//get all selected cars from the list
		List<WebElement> listCars = Sel.getAllSelectedOptions();
		for (WebElement webElement : listCars){
			System.out.println("selected car = "+ webElement.getText());
		}
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}
