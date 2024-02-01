package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		/*driver.get("https://letcode.in/edit");
		List<WebElement> labels =  driver.findElements(By.tagName("label"));
		
		WebElement lastElement = labels.get(labels.size()-1);
		System.out.println("lastElementName:-----> "+lastElement.getText());
		
		for (WebElement label : labels) {
			String text = label.getText();
			System.out.println(text);
		}
		
		int textSize = labels.size();
		if(textSize == 6) {
			System.out.println("Tested");
		}
		driver.quit();*/
		
		
		
		driver.get("https://www.google.com/");
		WebElement activeBar = driver.switchTo().activeElement();
		activeBar.sendKeys("cricket",Keys.ENTER);
		
		List<WebElement> cricketNames = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		//System.out.println(cricketNames.size());
		System.out.println(cricketNames.size());
//		for (WebElement EachNames : cricketNames) {
//			String name = EachNames.getText();
//			System.out.println(name);
//		}
		driver.quit();
	}

}
