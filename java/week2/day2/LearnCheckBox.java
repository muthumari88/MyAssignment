package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * WebElement basic = driver .findElement(By.
		 * xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"
		 * )); driver.executeScript("arguments[0].click();", basic);
		 */
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		WebElement ajax = driver.findElement(By.xpath(
				"//input[@type='checkbox']/following::span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check']"));
		driver.executeScript("arguments[0].click()", ajax);
		System.out.println(ajax);
		String nottext = driver.findElement(By.xpath("//span[text()='Checked']")).getText();

		if (nottext.contains("Checked")) {
			System.out.println("The Ajax Check box is checked");

		} else {
			System.out.println("The Ajax Check box is not checked");

		}

		Thread.sleep(5000);
		driver.close();
	}

}
