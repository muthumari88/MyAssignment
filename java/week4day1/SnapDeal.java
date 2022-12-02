package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement eleMen = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder = new Actions(driver);
		builder.doubleClick(eleMen).perform();
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		WebElement shirts = driver.findElement(By.xpath("//picture[@class='picture-elem']"));
		builder.doubleClick(shirts).perform();
	}

}
