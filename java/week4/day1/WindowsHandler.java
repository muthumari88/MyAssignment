package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandler {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//a[@class='a'][text()=' FLIGHTS ']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);

		driver.switchTo().window(windows.get(1));

		System.out.println(driver.getTitle());

		driver.switchTo().window(windows.get(0));

		System.out.println(driver.getTitle());

		driver.close();

	}

}
