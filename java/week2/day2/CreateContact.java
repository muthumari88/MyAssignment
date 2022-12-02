package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {

		// //Pseudo Code
		//
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		// Launch the browservv
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maimize the browser window
		driver.manage().window().maximize();
		// 2. Enter UserName and Password Using Id Locator
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		// 7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Muthu3");
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Mari3");
		// 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("MU");
		// 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("MA");
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("SeleniumNov");
		// 12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.name("description"))
				.sendKeys("This Contact is created for testing Selenium element locators");
		// 13. Enter your email in the E-mail address Field using the locator of your
		// choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc.bbc@tl.com");
		// 14. Select State/Province as NewYork Using Visible Text
		WebElement SP = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(SP);
		dd.selectByVisibleText("New York");
		// 15. Click on Create Contact
		driver.findElement(By.className("smallSubmit")).click();
		// 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		// 17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();

		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote"))
				.sendKeys("I have edited this contact using selenium automation");
		// 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		// 20. Get the Title of Resulting Page.
		String Title = driver.getTitle();
		System.out.println("The title of this page is : " + Title);
		Thread.sleep(2000);
		driver.close();

	}

}
