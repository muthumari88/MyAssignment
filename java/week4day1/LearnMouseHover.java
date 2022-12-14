package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement eleMen = driver.findElement(By.xpath("//a[text()='Men']"));

		Actions builder = new Actions(driver);
		builder.doubleClick(eleMen).perform();
	}

}
