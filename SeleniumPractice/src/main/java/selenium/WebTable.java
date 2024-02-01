package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://letcode.in/table");
		
		//1st Scenerio
		
		WebElement table = driver.findElement(By.id("simpletable"));
		//if we take driver.findelements means it shows all the elements in the current page. so we take table.findelement for get particular table values only
		List<WebElement> headers = table.findElements(By.tagName("th"));          //---> th for header tag
		for (WebElement header : headers) {
			String text = header.getText();
			System.out.println("Text for Headers: "+text);
		}
	
		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int size = allRows.size();
		System.out.println("Row size: "+size);
		//for validation
			if(size == 3) {
				System.out.println("passed");
			}else System.out.println("failed");
		
			for (WebElement row : allRows) {
				List<WebElement> columns = row.findElements(By.tagName("td"));  //this is for first rows all columns
				WebElement firstColumn = columns.get(0);
				System.out.println(firstColumn.getText());
			}
			
			
			//2nd Scenerio
			for (int i = 0; i < size; i++) {
				List<WebElement> rows = allRows.get(i).findElements(By.tagName("td"));
				WebElement lastName = rows.get(1);
				String text = lastName.getText();
				System.out.println(text);
				if(text.equals("Man")) {
					WebElement input = rows.get(3).findElement(By.tagName("input"));
					input.click();
					break;
				}
			}
		//driver.quit();
	}
}
