package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Gettitle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthumari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajagopal");
		WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(Source);
		dd.selectByValue("LEAD_WEBSITE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("gettitle");	//The title of the page is :View Lead | opentaps CRM
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is: "+  driver.getTitle());
		// close the browser
		Thread.sleep(2000);
		driver.close();

		// WebElement ele = driver.findElement(By.id("viewLead_firstName_sp"));
		// ele.clear();
		// ele.sendKeys("test");
		// ele.sendKeys(Keys.TAB);
	}
}