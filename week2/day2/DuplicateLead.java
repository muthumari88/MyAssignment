package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	/*
	 * http://leaftaps.com/opentaps/control/main
	 * 
	 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
	 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Click on Email 9
	 * Enter Email 10 Click find leads button 11 Capture name of First Resulting
	 * lead 12 Click First Resulting lead 13 Click Duplicate Lead 14 Verify the *
	 * title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm the duplicated lead
	 * * name is same as captured name 17 Close the browser (Do not log out)
	 * 
	 */

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
		// 8 Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		// 9 Enter Email
		driver.findElement(By.name("emailAddress")).sendKeys("abc.abc@gmail.com");
		// 10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		// Capture name of First Resulting lead
		String Leadname = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"))
				.getText();
		System.out.println("The Lead id based on the search is " + Leadname);
		// 12 Click First Resulting lead
		driver.findElement(By.xpath(
				"//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a[@class='linktext']"))
				.click();
		// 13 Click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		// Verify the title as 'Duplicate Lead'
		String Header = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		if (Header == "Duplicate Lead") {
			System.out.println("The return page is correct");
		}
		// Click Create Lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		// Confirm the duplicated lead name is same as captured name
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (name.equals(Leadname)) {
			System.out.println("The Given Leadid is  duplicated successfully");
		} else {
			System.out.println("The Given Leadid is not duplicated");
		}

		// 18 Close the browser (Do not log out)

		Thread.sleep(5000);
		driver.close();
	}

}
