package seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BlaBlaCarSignUp {
	
	public void method(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.blablacar.in/");
		
	}

}
