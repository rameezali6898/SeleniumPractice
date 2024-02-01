package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement fruit = driver.findElement(By.cssSelector("#fruits"));
		//WebElement fruit = driver.findElement(By.id("fruits"));
		
		//select by visibletext
		Select myFruit = new Select(fruit);
		myFruit.selectByVisibleText("Mango");
		System.out.println(myFruit.isMultiple());
		
		
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		//select by value
		myCountry.selectByValue("India");
		System.out.println(myCountry.getFirstSelectedOption().getText());
		
		WebElement heros = driver.findElement(By.id("superheros"));
		Select myHeros = new Select(heros);
		System.out.println(myHeros.isMultiple());
		myHeros.selectByIndex(0);
		myHeros.selectByValue("bt");
		
		//Deselect only used for multiple select options
		myHeros.deselectByIndex(0);
		
		
		//deselect
		myHeros.deselectByIndex(0);
		
		
		//Also we can use select option without select class by using bootstrap method which is directly find the xpath and click it.
		
	}
}
