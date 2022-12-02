package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "/location path u have to place
		// here") instead use the java library.
		// Launch the browservv
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maimize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Enter the username/password
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		// System.out.println(windowHandles);
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(//div[contains(@class,'x-grid3-row-alt')]/table[@class='x-grid3-row-table']/tbody/tr/td//a)[1]"))
				.click();
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}

}
