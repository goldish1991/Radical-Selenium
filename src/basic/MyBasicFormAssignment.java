package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyBasicFormAssignment {
	
	@Test
	public void method() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in");
				
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='Register.html']/img[@id='enterimg']")).click();
		
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div/form/div/div/input[@ng-model='FirstName']")).sendKeys("Swarnav");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/form[@id='basicBootstrapForm']/div/div/textarea[@ng-model='Adress']")).sendKeys("Hinjewadi");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		//CheckBox Selection
		boolean userInput = true;
		boolean currentState = driver.findElement(By.xpath("//input[@value='Movies']")).isSelected();
		
		if(userInput){
			if(currentState){
				System.out.println("Checkbox is already checked");
			}else{
				driver.findElement(By.xpath("//input[@value='Movies']")).click();
			}
		}else{
			if(!currentState){
				driver.findElement(By.xpath("//input[@value='Movies']")).click();
			}else{
				System.out.println("Checkbox is already Unchecked");
		}
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value='Movies']")).click();

		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Hockey']")).click();
		
		//ComboBox selection
		//option1
		driver.findElement(By.xpath("//select[@id='Skills']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Client Support']")).click();
		
		//option2
//		driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Client Support']")).click();
		
		//option3
//		WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));
//		Select sel = new Select(ele);
//		sel.selectByVisibleText("Client Support");
		}
	}
	
}
