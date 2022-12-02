package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']"))
				.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println(windowHandles);
		if (windowHandles.size() > 1) {
			System.out.println("There are two active windows");
		} else {
			System.out.println("There is only one active windows");
		}
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-help']"))
				.click();
		windowHandles = driver.getWindowHandles();
		System.out.println("The number of windows opended are : " + windowHandles.size());
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right ui-button-warning']"))
				.click();
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		for (int i = 1; i < windows.size(); i++) {
			driver.switchTo().window(windows.get(i));
			driver.close();
		}
		driver.switchTo().window(windows.get(0));
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		System.out.println("The number of windows active after closing the child tab : " + windowHandles.size());
		driver.findElement(By.xpath(
				"//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']"))
				.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(3));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
