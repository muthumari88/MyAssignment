package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Boolean Disabled = driver.findElement(By.xpath(
				"//div[@class='card']//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"))
				.isEnabled();
		String str1 = new Boolean(Disabled).toString();
		if (str1.equals("false")) {
			System.out.println("The Give Button is Disabled");
		} else {
			System.out.println("The Give Button is not Disabled");
		}
		Point position = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']//span[@class='ui-button-text ui-c']"))
				.getLocation();
		int x = position.getX();
		int y = position.getY();
		System.out.println("The Position of the Button is :" + x + "," + y);
		WebElement color = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']"));
		System.out.println("The Color of the Button is : " + color.getCssValue("background-color"));
		WebElement hw = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"));
		int buttonheight = hw.getSize().getHeight();
		int buttonwidth = hw.getSize().getWidth();
		System.out.println("The Height and the Width of the button is :" + buttonheight + "," + buttonwidth);
		Dimension hw1 = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']"))
				.getSize();
		int buttonheight1 = hw1.height;
		int buttonwidth1 = hw1.width;
		System.out.println("The Height and the Width of the button is :" + buttonheight1 + "," + buttonwidth1);
		WebElement button1 = driver
				.findElement(By.xpath("//h5[contains(text(),'Mouse over')]/following-sibling::button"));
		String but1 = button1.getCssValue("background-color");
		System.out.println("Color before Mouse Over: " + but1);
		Actions hover = new Actions(driver);
		hover.moveToElement(button1).perform();
		String but2 = button1.getCssValue("background-color");
		System.out.println("Color After mouse Over= " + but2);
		if (but1.equals(but2)) {
			System.out.println("Color Not changed after Mouse over");
		} else {
			System.out.println("Color changed after Mouse over");
		}
		driver.findElement(By.xpath("//div[@class='col-6']/button")).click();
		driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']/img")).click();
		WebElement primary = driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only rounded-button mr-2 mb-2']//span[@class='ui-button-text ui-c']"));
		System.out.println("Number of Rounded buttons = " + primary.getSize());
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		if (driver.getTitle().equals("Dashboard")) {
			System.out.println("The Button has taken to " + driver.getTitle() + " page");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
