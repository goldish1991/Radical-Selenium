package advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTableUtil {
	
	public String CellValue(WebDriver driver, String col1, String col2, String colValue){
		List<WebElement> colNames = driver.findElements(By.xpath("//table/thead/tr/th"));
		
		int colName1Position =0;
		for(int i =1;i<=colNames.size();i++ ){
			String colName= driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(colName.equals(col1)){
				colName1Position = i;
			}
			
		}
		
		int colName2Position =0;
		for(int i =1;i<=colNames.size();i++ ){
			String colName= driver.findElement(By.xpath("//table/thead/tr/th["+i+"]")).getText();
			if(colName.equals(col2)){
				colName2Position = i;
			}
			
		}
		
		int rowPosition = 0;
		
		List<WebElement> rowEle = driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(int i =1;i<=rowEle.size();i++){
			String rowValue = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+colName1Position+"]")).getText();
			if(rowValue.equals(colValue)){
				rowPosition = i;
				break;
			}
		}
		
		
		String cellValue = driver.findElement(By.xpath("//table/tbody/tr["+rowPosition+"]/td["+colName2Position+"]")).getText();
		return cellValue;
	}

}
