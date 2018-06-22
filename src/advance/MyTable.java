package advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTable {
	
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\PDE\\Jindegi\\Selenium\\Radical_Softwar_Selenium_Training\\Selenium Webdriver\\geckodriver_64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://money.rediff.com/mutual-funds/liquid");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		MyTableUtil tab = new MyTableUtil();
		String cellValue = tab.CellValue(driver, "Company", "Type", "Edelweiss Asset Management Ltd.");
		Assert.assertEquals(cellValue, "Open Ended");
		
		
		
		
//		B13TableUtilLim obj = new B13TableUtilLim();
//		String actCellValue = obj.getTableCellValue(driver, "Type", "Company", "Edelweiss Asset Management Ltd.");
//		Assert.assertTrue(actCellValue.equals("116.47"),"value wrong");
//		System.out.println(" -==== ="+actCellValue);
		
		
//		MyTableUtilB10 obj = new MyTableUtilB10();
//		String cellValue =obj.getCellValue(driver, "Company", "Plan", "Principal Pnb Asset Management Co. Pvt. Ltd.");
//		Assert.assertEquals(cellValue, "Growth");
		


//		
//		TableUtilB88 obj = new TableUtilB88();
//		String actualValue = obj.getTableCellValue(driver, "Returns(%)", "Company", "JP Morgan Asset Management India Pvt. Ltd.");
//		Assert.assertTrue(actualValue.equals("8.84"),"value wrong");
		
		
		
		
		//String cellValue = driver.findElement(By.xpath("//table[@class='dataTable']//thead/tr/th["+columnIndex+"]/../../following-sibling::tbody/tr[7]/td["+columnIndex+"]")).getText();
		//Assert.assertTrue(cellValue.equals("7.12"));
		//System.out.println("Value = "+cellValue);
		
	}
		
}
