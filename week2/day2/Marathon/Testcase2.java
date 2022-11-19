package week2.day2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Testcase:2 1. Login to https://login.salesforce.com 2. Click on toggle menu
		 * button from the left corner 3. Click view All and click Sales from App
		 * Launcher 4. Click on Accounts tab 5. Click on New button 6. Enter 'your name'
		 * as account name 7. Select Ownership as Public 8. Click save and verify
		 * Account name "
		 */

		WebDriverManager.chromedriver().setup();
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("Testleaf$321");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		driver.findElement(By.xpath("//div[@data-name='Sales']//p[contains(text(),'Sales')]")).click();
		WebElement acc = driver.findElement(By.xpath("//a[@title='Accounts']/span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()", acc);
		driver.findElement(By.xpath("//a[@title='New']/div[text()='New']")).click();

		driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']/input[@name='Name']"))
				.sendKeys("Muthumari");
		WebElement own = driver.findElement(By.xpath("//button[@aria-label='Ownership, --None--']"));
		driver.executeScript("arguments[0].click()", own);
		WebElement owner = driver.findElement(By.xpath("//span[@title='Public']"));
		driver.executeScript("arguments[0].click()", owner);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String Accname = driver.findElement(By.xpath("//lightning-formatted-text[text()='Muthumari']")).getText();
		System.out.println("The Give Accountname Name is:" + Accname);
		if (Accname.equals("Muthumari")) {
			System.out.println("The Given Name is correct");
		} else {
			System.out.println("The Given Name is not correct");

		}
		Thread.sleep(2000);
		driver.close();
	}

}
