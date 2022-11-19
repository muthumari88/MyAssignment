package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathCode {

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

		WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
		elePassword.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Muthumari");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajagopal");
		// WebElement Source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.equals("Muthumari")) {
			System.out.println("First name is correct");
		} else {
			System.out.println("First name is incorrect");
		}
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext'][1]"));
		driver.findElement(By.xpath("//span[@class='brand-num']/following::div[@class='common-checkboxIndicator']"));
		driver.findElement(By.xpath(
				"//input[@type='checkbox']/label[contains(text()='Flying Machine')]"));
		//textarea[contains(text()='This Contact is created for testing Selenium element locators')]//following::input[@name='submitButton']

		// close the browser
		Thread.sleep(2000);
		driver.close();

		// WebElement ele = driver.findElement(By.id("viewLead_firstName_sp"));
		// ele.clear();
		// ele.sendKeys("test");
		// ele.sendKeys(Keys.TAB);
	}

}
