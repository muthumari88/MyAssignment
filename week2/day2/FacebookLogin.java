package week2.day2;

import java.time.Duration;

//import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// setup browser driver
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "/location path u have to place
		// here") instead use the java library.
		// Launch the browservv
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("https://en-gb.facebook.com/");
		// Maimize the browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter the username/passwords
		//Great grandparent to great grand child
		driver.findElement(By.xpath("//form[@id='u_0_2_Vl']//a[text()='Create New Account']")).click();
		//Basic xpath
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		// Grandparent to GrandChild
		driver.findElement(By.xpath("//div[@id='fullname_field']//input[@name='firstname']")).sendKeys("SELE");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("NIUM");
		// parent to child
		driver.findElement(By.xpath(
				"//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']/input[@name='reg_email__']"))
				.sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("selenium");
		WebElement dddate = driver.findElement(By.name("birthday_day"));
		Select DOBD = new Select(dddate);
		DOBD.selectByValue("1");
		WebElement ddmonth = driver.findElement(By.name("birthday_month"));
		Select DOBM = new Select(ddmonth);
		DOBM.selectByValue("1");
		WebElement ddyear = driver.findElement(By.name("birthday_year"));
		Select DOBY = new Select(ddyear);
		DOBY.selectByValue("1975");
		// child to parent
		// driver.findElement(By.xpath("//input[@name='sex']/parent::span[@class='_5k_2
		// _5dba']")).click();
		// elder sibling to younger
		// driver.findElement(By.xpath("//label[text()='Female']/following_sibling::input[@value='1']")).click();
		//Parent to Child
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@name='sex']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
