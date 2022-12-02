package week2.day2.Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Testcase 3 ========== 1) Launch the app 2) Click Login 3) Login with the
		 * credentials 4) Click on Global Actions SVG icon (can see as + icon at right
		 * corner) 5) Click New Task 6) Enter subject as ""Bootcamp "" 7) Select status
		 * as 'Waiting on someone else' 9) Save and verify the 'Task created' message"
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
		WebElement plus = driver.findElement(By.xpath("//span[text()='Global Actions']"));
		driver.executeScript("arguments[0].click()", plus);
		WebElement newtask = driver.findElement(By.xpath("//span[text()='New Task']"));
		driver.executeScript("arguments[0].click()", newtask);
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		WebElement status = driver.findElement(By.xpath("//div[@class='uiPopupTrigger']//a[text()='Not Started']"));
		driver.executeScript("arguments[0].click()", status);
		driver.findElement(By.linkText("Waiting on someone else")).click();
		driver.findElement(By.xpath(
				"//button[@class='slds-button slds-button--brand cuf-publisherShareButton uiButton']//span[text()='Save']"))
				.click();
		String Taskname = driver
				.findElement(By.xpath(
						"//span[@class='toastMessage slds-text-heading--small forceActionsText'][text()='Task']"))
				.getText();
		System.out.println("The Status is:" + Taskname);
		if (Taskname.contains("Bootcamp")) {
			System.out.println("The Given Name is correct");
		} else {
			System.out.println("The Given Name is not correct");

		}

		Thread.sleep(2000);
		driver.close();
	}

}
