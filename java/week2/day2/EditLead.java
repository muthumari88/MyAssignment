package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 
		 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
		 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Enter first name
		 * 9 Click Find leads button 10 Click on first resulting lead 11 Verify title of
		 * the page 12 Click Edit 13 Change the company name 14 Click Update 15 Confirm
		 * the changed name appears 16 Close the browser (Do not log out)
		 */
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
		// 8 Enter first name
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='firstName']"))
				.sendKeys("Muthumari");
		Thread.sleep(5000);
		// 9 Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 10 Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"))
				.click();
		// 11 Verify title of the page
		String Header = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		if (Header.contains("View")) {
			System.out.println("The return page is correct");
		}
		// 12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		// 13 Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("edTech");
		// 14 Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		// 15 Confirm the changed name appears
		String Compname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (Compname.contains("edTech")) {
			System.out.println("The Given Company Name got changed successfully.");

		} else
			System.out.println("The Given Company Name donesn't changed successfully.");
		// 16 Close the browser (Do not log out)
		Thread.sleep(5000);
		driver.close();
	}

}
