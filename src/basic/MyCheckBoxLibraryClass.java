package basic;

import java.sql.Driver;

import org.openqa.selenium.By;

public class MyCheckBoxLibraryClass {

	package basic;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class B14CheckboxLib {
		
		
		public void selectCheckbox(By by, WebDriver driver , boolean userInput, boolean currentState){
			if(userInput){
				if(currentState){
					System.out.println("already checked");
				}else{
					driver.findElement(by).click();
				}
			}
			
			if(!userInput){
				if(currentState){
					driver.findElement(by).click();
				}else{
					System.out.println("already Unchecked");
				}
			}
		}

}
