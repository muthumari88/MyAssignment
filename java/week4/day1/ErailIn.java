package week4.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailIn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("CBE");
		Thread.sleep(2000);
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//td[@id='tdDateOnly']/input[@type='checkbox']")).click();
		Thread.sleep(5000);
		List<WebElement> trainName = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		int trainNameSize = trainName.size();
		System.out.println(trainNameSize);
		Set<String> trainsName = new HashSet<String>();
		for (int i = 1; i <= trainNameSize; i++) {
			String textName = driver.findElement(
					By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + i
							+ "]//td[2]"))
					.getText();
			System.out.println(textName);
			trainsName.add(textName);

		}
		if (trainNameSize == trainsName.size()) {
			System.out.println("There is no Duplicates");
		} else {
			System.out.println("There is a duplicate");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
