package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MySeleniumAssignment4 {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/listbox/examples/overview/defaultvb.aspx");
		
//		int myArray[] = new int[16];
//		String listContent = "";
//		CntryListBox(int myArray, String listContent){
//			i=myArray[];
//			
//		}
//		CntryListBox Cntry = new CntryListBox(myArray, listContent);
		int count = 0 ;
		for(int i=0; i<9; i++){
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[contains(text(),'Argentina')]")).click();
			driver.findElement(By.xpath("//li/button[@title='To Right']")).click();
			count++;
			System.out.println(count);
			}
		
	}
	
}