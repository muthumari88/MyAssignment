package week2.day2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// Testcase:1
		/*
		 * 1. Login to https://login.salesforce.com 2. Click on toggle menu button from
		 * the left corner 3. Click view All and click Sales from App Launcher 4. Click
		 * on Opportunity tab 5. Click on New button 6. Enter Opportunity name as
		 * 'Salesforce Automation by Your Name,Get the text and Store it 7. Choose close
		 * date as Today 8. Select 'Stage' as Need Analysis 9. click Save and
		 * VerifyOppurtunity Name"
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
		WebElement opp = driver
				.findElement(By.xpath("//a[@title='Opportunities']/span[contains(text(),'Opportunities')]"));
		driver.executeScript("arguments[0].click()", opp);
		driver.findElement(By.xpath("//a[@title='New']/div[contains(text(),'New')]")).click();
		driver.findElement(By.xpath("//records-record-layout-row[@class='slds-form__row']//input[@name='Name']"))
				.sendKeys("Salesforce Automation Muthumari");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("11/16/2022");
		driver.findElement(By.xpath("//button[@data-value='--None--']/span[@class='slds-truncate']")).click();
		WebElement stage = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
		driver.executeScript("arguments[0].click()", stage);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String VOPNAME = driver
				.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation Muthumari']"))
				.getText();
		System.out.println("The Give Opportuity Name is:" + VOPNAME);
		if (VOPNAME.equals("Muthumari")) {
			System.out.println("The Given Name is correct");
		} else {
			System.out.println("The Given Name is not correct");

		}
		Thread.sleep(2000);
		driver.close();
	}

}
