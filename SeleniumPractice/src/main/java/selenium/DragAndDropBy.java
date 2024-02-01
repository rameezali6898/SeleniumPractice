package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropBy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("draggable"));
		
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		
		Actions builder = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		builder.dragAndDropBy(ele, 25, 50).perform();
	}
}
