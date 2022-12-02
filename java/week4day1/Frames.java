package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement frames = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frames);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Muthumari");
		alert.accept();
		String name = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(name);
		if (name.contains("Muthumari")) {
			System.out.println("The Given name is displayed");
		} else {
			System.out.println("The Given name is not displayed");

		}
		// driver.switchTo().defaultContent();
		// Thread.sleep(2000);
		driver.close();
	}

}
