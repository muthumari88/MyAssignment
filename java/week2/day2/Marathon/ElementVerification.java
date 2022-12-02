package week2.day2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Launch the browservv
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maimize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 2 Enter the username
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		System.out.println(eleUserName.getAttribute("type"));
		// 3 Enter the password
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		// 4 Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		String Expectedurl = crmsfa.getAttribute("href");

		System.out.println(Expectedurl);
		Thread.sleep(2000);
		driver.close();
	}

}
