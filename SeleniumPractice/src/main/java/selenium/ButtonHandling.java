package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/buttons");
		
		//Get the X&Y Coordinates
		WebElement findLocation = driver.findElement(By.id("position"));
		Point point = findLocation.getLocation();
		int x = point.getX();
		int y = point.getY();
		System.out.println("X => "+x+"  Y=> "+y);
		
		//Find the colour of the Button
		WebElement btncolour = driver.findElement(By.id("color"));
		String color = btncolour.getCssValue("background-color");
		System.out.println(color);
		
		//Find the Height&Width
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		//****************************We can use like this*********************
		
		Dimension dimen = rect.getDimension();
		System.out.println(dimen);
		System.out.println(dimen.getHeight());
		System.out.println(dimen.getWidth());
		
		//Confirm the button is enable or not
		boolean buttonStatus = driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(buttonStatus);
		
		driver.quit();
	}

}
