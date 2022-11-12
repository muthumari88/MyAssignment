package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "/location path u have to place
		// here") instead use the java library.
		// Launch the browservv
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maimize the browser window
		driver.manage().window().maximize();

		// Enter the username/password

		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthumari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajagopal");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("EditLead");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("This is to check for the Selenium Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc.abc@gmail.com");
		Select dd1 = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		dd1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement desclr = driver.findElement(By.name("description"));
		desclr.clear();
		driver.findElement(By.id("updateLeadForm_importantNote"))
				.sendKeys("This is to check for the Selenium Automation");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println("The title of the page is :" + driver.getTitle());
		// close the browser
		Thread.sleep(2000);
		driver.close();
		
		// ele.sendKeys("test");
		// ele.sendKeys(Keys.TAB);
	}
}
