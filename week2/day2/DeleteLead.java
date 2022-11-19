package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// http://leaftaps.com/opentaps/control/main

		// Delete Lead:
		// 1 Launch the browser
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
		// 3 Enter the password
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		// 4 Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
		// 5 Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// 6 Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		// 7 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// 8 Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		// 9 Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("1475236980");
		// 10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		// 11 Capture lead ID of First Resulting lead
		String Leadid = driver.findElement(By.xpath(
				"//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext']"))
				.getText();
		System.out.println("The Lead id based on the search is " + Leadid);

		// 12 Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"))
				.click(); // 13 Click Delete
		driver.findElement(By.linkText("Delete")).click();
		// 14 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// 15 Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Leadid);
		// 16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 17 * Verify message "No records to display" in the Lead List. This message
		String Vm = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (Vm.equals("No records to display")) {
			System.out.println("The Given Leadid is not present in the list");
		} else {
			System.out.println("The Given Leadid is present in the list");
		}
// confirms	 * the successful deletion

		// 18 Close the browser (Do not log out)

		Thread.sleep(5000);
		driver.close();
	}

}
