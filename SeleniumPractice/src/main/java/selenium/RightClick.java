package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform();
	}

}
